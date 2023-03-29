import java.util.HashMap;
import java.util.Map;
 
public class CardService {
    private Map<Integer, Card> cardMap; 
    private Integer cardIndex;
 
    public CardService(){
        this.cardMap = new HashMap<>();
        this.cardIndex = 0;
    }

    public String createCard(Integer cardId, Card card){
        if (this.cardMap.containsKey(cardId)){
            return "Error Card Id";
        }
        if (card.getCardNumber().toString().length() != 16){
            return "Wrong Card Number";
        }
        if (card.getCardCode().toString().length() != 4){
            return "Wrong Card Code";
        }
        card.setCardId(++this.cardIndex);
        this.cardMap.put(cardId, card);
        return "Card successful created";
    }

    public String getCard(Integer cardId){
        if (this.cardMap.containsKey(cardId)){
            return this.cardMap.get(cardId).toCard();
        }
        return "Card is not found";
    }

    public String updateCard(Integer cardId, Card card){
        Integer cardOn;
        if (this.cardMap.containsKey(cardId)){
            cardOn = this.cardMap.get(cardId).getCardId();
            card.setCardId(cardOn);
            this.cardMap.replace(cardId, this.cardMap.get(cardId), card);
            return "Card successful updated";
        }
        return "Card is not found";
    }

    public String deleteCard(Integer cardId){
        if (this.cardMap.containsKey(cardId)){
            if (this.cardMap.remove(cardId, this.cardMap.get(cardId))){
                return "Card is successful deleted";
            }
        }
        return "Card is not found";
    }
}
