package by.andervyd.temp.menu;

public enum Soup {
    TOMATO("vegetable") {  // Constant-specific class body
        public String starRating() {
            return "5 star rated";
        }
    },
    CHICKEN("meat"),
    PRAWN("seafood") {  // Constant-specific class body
        public String starRating() {
            return "3 star rated";
        }
    };
    String type;
    /*
      enum constructor
    */
    Soup(String type) {
        this.type = type;
    }
    String getType() {
        return this.type;
    }
    /*
      default star rating
    */
    String starRating() {
        return "not rated yet";
    }
}
