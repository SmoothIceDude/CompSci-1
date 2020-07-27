
public class Plot {

	private int x, y, width, depth;

	public Plot() {
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}

	public Plot(Plot p) {
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}

	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}

	public boolean overlaps(Plot parameter) {
		if( ((parameter.x >= x && parameter.x < (x + width)) &&  (parameter.y >= y && parameter.y < (y + depth))) ||
				((x >= parameter.x && x < (parameter.x + width)) &&  (y >= parameter.y && y < (parameter.y + parameter.depth))) ||
				((parameter.x + parameter.width) > x && (parameter.x + parameter.width) < (x + width) && parameter.y >= y && parameter.y <= (y + depth)) ||
				((x + width) > parameter.x && (x + width) < (parameter.x + parameter.width) && y >= parameter.y && y <= (parameter.y + parameter.depth)) ||
				(parameter.x >= x && parameter.x < (x +  width) && (parameter.y + parameter.depth) > y && (parameter.y + parameter.depth) <= (y + depth)) ||
				(x >= parameter.x && x < (parameter.x +  parameter.width) && (y + depth) > parameter.y && (y + depth) <= (parameter.y + parameter.depth)) ||
				((parameter.x + parameter.width) > x && (parameter.x +parameter.width) <= (x + width) && (parameter.y + parameter.depth) > y && (parameter.y + parameter.depth) <= (y + depth)) ||
				((x + width) > parameter.x && (x + width) <= (parameter.x + parameter.width) && (y + depth) > parameter.y && (y + depth) <= (parameter.y + parameter.depth)) ){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean encompasses(Plot parameter) {
		if( (parameter.x >= x) && (parameter.y >= y) && (parameter.x + parameter.width <= x + width) &&
				(parameter.y + parameter.depth <= y + depth) ) {
			return true;
		} else {
			return false;
		}
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setWidth(int width){
		this.width = width;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	@Override
	public String toString() {
		return "Upper left: (" + x + "," + y + ") Width: " + width + " Depth: " + depth;
	}
}
