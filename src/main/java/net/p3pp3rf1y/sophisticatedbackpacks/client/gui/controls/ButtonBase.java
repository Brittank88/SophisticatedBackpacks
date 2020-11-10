package net.p3pp3rf1y.sophisticatedbackpacks.client.gui.controls;

import java.util.function.Predicate;

public abstract class ButtonBase extends Widget {
	protected final int width;
	protected final int height;
	protected final Predicate<Integer> onClick;

	public ButtonBase(int x, int y, int width, int height, Predicate<Integer> onClick) {
		super(x, y);
		this.width = width;
		this.height = height;
		this.onClick = onClick;
	}

	@Override
	public boolean mouseClicked(double mouseX, double mouseY, int button) {
		return onClick.test(button);
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}
}