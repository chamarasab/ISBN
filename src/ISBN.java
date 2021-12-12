public class ISBN {
    private int countryNumber; 
    private int publisherNumber; 
    private int titleNumber; 
    private int checkDigit;
    
    public ISBN() {
        countryNumber = 0; 
        publisherNumber = 0; 
        titleNumber = 0; 
        checkDigit = 0;
    }

    public int getCountryNumber() {
        return countryNumber;
    }

    public void setCountryNumber(int countryNumber) {
        this.countryNumber = countryNumber;
    }

    public int getPublisherNumber() {
        return publisherNumber;
    }

    public void setPublisherNumber(int publisherNumber) {
        this.publisherNumber = publisherNumber;
    }

    public int getTitleNumber() {
        return titleNumber;
    }

    public void setTitleNumber(int titleNumber) {
        this.titleNumber = titleNumber;
    }

    public int getCheckDigit() {
        return checkDigit;
    }

    public void setCheckDigit(int checkDigit) {
        this.checkDigit = checkDigit;
    }

    public String getISBN() { 
        return countryNumber + " " + publisherNumber + " " + titleNumber + " " + checkDigit; 
    }

    public void setISBN(int n1, int n2, int n3, int n4) { 
        countryNumber = n1; 
        publisherNumber = n2; 
        titleNumber = n3; 
        checkDigit = n4; 
    }
}
