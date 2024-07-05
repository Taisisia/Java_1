package org.example._20240605.InnerClassTest.zoo;

public class Zoo {
    private Monkey monkey = new Monkey();
    public String getMonkey (){
        return monkey.getBanana();
    }
    public class Monkey {
        private Banana banana = new Banana();
        public String getBanana () {
            return banana.getSort();
        }
        public class Banana {
            private String sort = "Yellow";
            public String getSort() {
                return sort;
            }
        }
    }

}
