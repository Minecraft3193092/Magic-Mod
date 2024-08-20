package net.mcreator.magicmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.magicmod.world.inventory.MagicSmartStoragePasswordUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MagicSmartStoragePasswordUIScreen extends AbstractContainerScreen<MagicSmartStoragePasswordUIMenu> {
	private final static HashMap<String, Object> guistate = MagicSmartStoragePasswordUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox password;
	Button button_head_scan;
	Button button_finger_scan;
	Button button_confirm;

	public MagicSmartStoragePasswordUIScreen(MagicSmartStoragePasswordUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("magicmod:textures/screens/magic_smart_storage_password_ui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		password.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (password.isFocused())
			return password.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		password.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String passwordValue = password.getValue();
		super.resize(minecraft, width, height);
		password.setValue(passwordValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.magicmod.magic_smart_storage_password_ui.label_password"), 65, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.magicmod.magic_smart_storage_password_ui.label_enter_password"), 29, 19, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		password = new EditBox(this.font, this.leftPos + 29, this.topPos + 30, 118, 18, Component.translatable("gui.magicmod.magic_smart_storage_password_ui.password"));
		password.setMaxLength(32767);
		guistate.put("text:password", password);
		this.addWidget(this.password);
		button_head_scan = Button.builder(Component.translatable("gui.magicmod.magic_smart_storage_password_ui.button_head_scan"), e -> {
		}).bounds(this.leftPos + 52, this.topPos + 59, 72, 20).build();
		guistate.put("button:button_head_scan", button_head_scan);
		this.addRenderableWidget(button_head_scan);
		button_finger_scan = Button.builder(Component.translatable("gui.magicmod.magic_smart_storage_password_ui.button_finger_scan"), e -> {
		}).bounds(this.leftPos + 47, this.topPos + 85, 82, 20).build();
		guistate.put("button:button_finger_scan", button_finger_scan);
		this.addRenderableWidget(button_finger_scan);
		button_confirm = Button.builder(Component.translatable("gui.magicmod.magic_smart_storage_password_ui.button_confirm"), e -> {
		}).bounds(this.leftPos + 57, this.topPos + 126, 61, 20).build();
		guistate.put("button:button_confirm", button_confirm);
		this.addRenderableWidget(button_confirm);
	}
}
