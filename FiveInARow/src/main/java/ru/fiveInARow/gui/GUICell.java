package ru.fiveInARow.gui;

import ru.fiveInARow.interfaces.ICell;

import java.awt.*;

public class GUICell implements ICell<Graphics> {

	private boolean smallPaint = false;
	private boolean bigPaint = false;

	private boolean suggestEmpty = false;

	private boolean checked = false;
	private boolean checkedClick = false;

	private boolean red = false;
	private boolean green = false;
	private boolean blue = false;
	private boolean yellow = false;
	private boolean magenta = false;
	private boolean cyan = false;

	@Override
	public boolean isSmallCellPainted() {
		return this.smallPaint;
	}

	@Override
	public void smallCellPainting() {
		this.smallPaint = true;
	}

	@Override
	public void cancelSmallCellPainting() {
		this.smallPaint = false;
	}

	@Override
	public boolean isBigCellPainted() {
		return this.bigPaint;
	}

	@Override
	public void bigCellPainting() {
		this.bigPaint = true;
	}

	@Override
	public void cancelBigCellPainting() {
		this.bigPaint = false;

		this.red = false;
		this.green = false;
		this.blue = false;
		this.yellow = false;
		this.magenta = false;
		this.cyan = false;
	}



	@Override
	public void redCell() {
		this.red = true;
	}

	@Override
	public void greenCell() {
		this.green = true;
	}

	@Override
	public void blueCell() {
		this.blue = true;
	}

	@Override
	public void yellowCell() {
		this.yellow = true;
	}

	@Override
	public void magentaCell() {
		this.magenta = true;
	}

	@Override
	public void cyanCell() {
		this.cyan = true;
	}



	@Override
	public boolean isRedCell() {
		return this.red;
	}

	@Override
	public boolean isGreenCell() {
		return this.green;
	}

	@Override
	public boolean isBlueCell() {
		return this.blue;
	}

	@Override
	public boolean isYellowCell() {
		return this.yellow;
	}

	@Override
	public boolean isMagentaCell() {
		return this.magenta;
	}

	@Override
	public boolean isCyanCell() {
		return this.cyan;
	}



	@Override
	public boolean isSuggestEmpty() {
		return this.suggestEmpty;
	}

	@Override
	public void suggestEmpty() {
		this.suggestEmpty = true;
	}

	@Override
	public void cancelSuggestEmpty() {
		this.suggestEmpty = false;
	}

	@Override
	public boolean isChecked() {
		return this.checked;
	}

	@Override
	public void checked() {
		this.checked = true;
	}

	@Override
	public void selectColor(Graphics paint, String symbol) {
		if (this.isRedCell())
			paint.setColor(Color.red);
		else if (this.isGreenCell())
			paint.setColor(Color.green);
		else if (this.isBlueCell())
			paint.setColor(Color.blue);
		else if (this.isYellowCell())
			paint.setColor(Color.yellow);
		else if (this.isMagentaCell())
			paint.setColor(Color.magenta);
		else if (this.isCyanCell())
			paint.setColor(Color.cyan);
		else
			paint.setColor(Color.black);
	}

	@Override
	public void generateColor(int numColor) {
		switch (numColor) {
			case 0: this.redCell();
				break;
			case 1: this.greenCell();
				break;
			case 2: this.blueCell();
				break;
			case 3: this.yellowCell();
				break;
			case 4: this.magentaCell();
				break;
			case 5: this.cyanCell();
				break;
		}
	}

	@Override
	public int checkColor() {
		int color;
		if (this.isRedCell())
			color = 0;
		else if (this.isGreenCell())
			color = 1;
		else if (this.isBlueCell())
			color = 2;
		else if (this.isYellowCell())
			color = 3;
		else if (this.isMagentaCell())
			color = 4;
		else if (this.isCyanCell())
			color = 5;
		else
			color = 6;
		return color;
	}

	@Override
	public void draw(Graphics paint) {
	}

	@Override
	public void draw(Graphics paint, int x, int y) {
		x = x * 40 + 16;
		y = y * 40 + 25;
		if (this.isBigCellPainted()) {
			selectColor(paint, null);
			drawLine(paint, x, y);
			paint.fillOval(x - 11, y - 20, 30, 30);
		} else if (this.isSmallCellPainted()) {
			selectColor(paint, null);
			drawLine(paint, x, y);
			paint.fillOval(x - 2, y - 11, 12, 12);
		} else if (this.isSuggestEmpty()) {
			selectColor(paint, null);
			drawLine(paint, x, y);
		}
	}

	public void drawLine(Graphics paint, int x, int y) {
		paint.drawLine(x - 16, y - 25, x - 16, y + 15);
		paint.drawLine(x - 16, y - 25, x + 24, y - 25);
		paint.drawLine(x + 24, y - 25, x + 24, y + 15);
		paint.drawLine(x - 16, y + 15, x + 24, y + 15);
	}

	@Override
	public boolean isCheckedClick() {
		return this.checkedClick;
	}

	@Override
	public void checkedClick() {
		this.checkedClick = true;
	}

	@Override
	public void cancelCheckedClick() {
		this.checkedClick = false;
	}
}
