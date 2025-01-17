package sec14;

public class Car {
	private int speed;
	private boolean stop;
	
	// 필드가 private일 경우 Getter/Setter 메소드라는 방법을 통해서 접근/ 수정할 수 있게 됨.
	
	//Getter(값 반환)
	public int getSpeed() {
		return speed;
	}
	
	//setter(값 설정)
	public void setSpeed(int speed) {
		//this.speed=speed;
		
		if(speed < 0) {
			this.speed= 0;
			// 속력은 음수가 나올 수 없으므로
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
		// return this.stop;
	}
	
	//setter
	public void setStop(boolean stop) {
		this.stop = stop;
		
		if(stop == true) {
			this.speed = 0;
		}
	}
}
