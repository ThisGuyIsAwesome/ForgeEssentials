package com.ForgeEssentials.commands;

import net.minecraft.server.MinecraftServer;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ICommandSender;

import com.ForgeEssentials.core.OutputHandler;
import com.ForgeEssentials.core.commands.ForgeEssentialsCommandBase;

import cpw.mods.fml.relauncher.ArgsWrapper;
import cpw.mods.fml.relauncher.FMLRelauncher;

public class CommandRestart extends ForgeEssentialsCommandBase {

	@Override
	public String getCommandName() {
		return "restart";
	}

	@Override
	public void processCommandPlayer(EntityPlayer player, String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void processCommandConsole(ICommandSender sender, String[] args) {
		OutputHandler.SOP("Not implemented");
		/**
	    OutputHandler.SOP("Restarting server...");
		MinecraftServer.getServer().stopServer();
		MinecraftServer.getServer().initiateShutdown();
		MinecraftServer.main(args);
		*/
		
		
	}

	@Override
	public String getSyntaxConsole() {
		return "/restart";
	}

	@Override
	public String getSyntaxPlayer(EntityPlayer player) {
		return null;
	}

	@Override
	public String getInfoConsole() {
		return "Restarts the server";
	}

	@Override
	public String getInfoPlayer(EntityPlayer player) {
		return null;
	}

	@Override
	public boolean canConsoleUseCommand() {
		return true;
	}

	@Override
	public boolean canPlayerUseCommand(EntityPlayer player) {
		return false;
	}

}
