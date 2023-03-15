package Builder;

public class Computer {

    //Required
    String monitor;
    String cpu;
    String keyboard;
    String mouse;

    //Optional
    String webcam;
    String headphone;
    String mousepad;

    @Override
    public String toString() {
        return "Computer{" +
                "monitor='" + monitor + '\'' +
                ", cpu='" + cpu + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", webcam='" + webcam + '\'' +
                ", headphone='" + headphone + '\'' +
                ", mousepad='" + mousepad + '\'' +
                '}';
    }
    public static ComputerBuilder builder(){
        return new ComputerBuilder();
    }
    public static class ComputerBuilder{

        //Required
        String monitor;
        String cpu;
        String keyboard;
        String mouse;

        //Optional
        String webcam;
        String headphone;
        String mousepad;


        public ComputerBuilder withMonitor(String monitor){
        this.monitor=monitor;
        return this;
        }
        public ComputerBuilder withCpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public ComputerBuilder withKeyboard(String keyboard){
            this.keyboard = keyboard;
            return this;
        }
        public ComputerBuilder withMouse(String mouse){
            this.mouse = mouse;
            return this;
        }
        public ComputerBuilder withWebcam(String webcam){
            this.webcam = webcam;
            return this;
        }
        public ComputerBuilder withHeadphone(String headphone){
            this.headphone = headphone;
            return this;
        }

        public ComputerBuilder withMousepad(String mousepad){
            this.mousepad = mousepad;
            return this;
        }

        public Computer build(){
            if(this.monitor == null || this.cpu == null || this.mouse == null || this.keyboard == null){
                throw new RuntimeException("All required parts are not availble");
            }
            Computer com = new Computer();
            com.monitor = this.monitor;
            com.cpu = this.cpu;
            com.mouse = this.mouse;
            com.headphone = this.headphone;
            com.keyboard = this.keyboard;
            com.mousepad = this.mousepad;
            com.webcam = this.webcam;
            return com;
        }
    }

}
