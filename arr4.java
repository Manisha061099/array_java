public class arr4 {
  
        public String name;
        public int value;
        
        public arr4(String name, int value) {
            this.name = name;
            this.value = value;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
        
        
    @Override
    public String toString(){
        return name + value;
    }
    }
