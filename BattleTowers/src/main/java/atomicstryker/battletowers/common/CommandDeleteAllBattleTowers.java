package atomicstryker.battletowers.common;

import net.minecraft.command.ICommandSender;

public class CommandDeleteAllBattleTowers extends CommandBattleTowers
{

    @Override
    public String getCommandName()
    {
        return "deleteallbattletowers";
    }

    @Override
    public String getCommandUsage(ICommandSender icommandsender)
    {
        return "/deleteallbattletowers deletes all existing Battletowers, as logged in save file";
    }

    @Override
    public void processCommand(ICommandSender icommandsender, String[] astring)
    {
        WorldGenHandler.deleteAllTowers(icommandsender.getEntityWorld(), false);
        notifyAdmins(icommandsender, "All Battletowers deleted", new Object());
    }

}