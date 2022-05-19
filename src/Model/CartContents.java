package Model;

public class CartContents {
        private String pluCode;
        private String pluName;
        private int pluQty;
        private String pluPrice;

        public String getPluCode() {
            return pluCode;
        }

        public void setPluCode(String pluCode) {
            this.pluCode = pluCode;
        }

        public String getPluName() {
            return pluName;
        }

        public void setPluName(String pluName) {
            this.pluName = pluName;
        }

        public int getPluQty() {
            return pluQty;
        }

        public void setPluQty(int pluQty) {
            this.pluQty = pluQty;
        }

        public String getPluPrice() {
            return pluPrice;
        }

        public void setPluPrice(String pluPrice) {
            this.pluPrice = pluPrice;
        }

        private int PluPrice;

        public CartContents() {

        }
    }

