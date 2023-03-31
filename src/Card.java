public class Card {
    private Integer cardId;
    private String cardName; 
    private Long CardNumber; 
    private Integer cardCode; 
 
    public Card(String cardName, Long cardNumber, Integer cardCode) {
        this.cardName = cardName;
        CardNumber = cardNumber;
        this.cardCode = cardCode;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Long getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        CardNumber = cardNumber;
    }

    public Integer getCardCode() {
        return cardCode;
    }

    public void setCardCode(Integer cardCode) {
        this.cardCode = cardCode;
    }

    public String toCard() {
        return "Card{" +
                "cardId=" + cardId +
                ", cardName='" + cardName + '\'' +
                ", CardNumber=" + CardNumber +
                ", cardCode=" + cardCode +
                '}';
    }
}
