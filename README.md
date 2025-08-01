# Auto TPA Accept

A simple but effective LabyMod 4 addon designed to streamline the process of accepting teleport requests. This addon gives you full control over incoming `/tpa` and `/tpahere` requests by either automatically accepting them, providing a clean one-click button, or hiding them completely, all accompanied by customizable sound notifications.

## Features

-   **TPA Request Detection**: Automatically detects `/tpa accept <playername>` and `/tpahere accept <playername>` commands in incoming chat messages.
-   **Auto-Accept Mode**: When enabled, the addon instantly accepts any detected TPA request and sends a confirmation message to your chat. You can configure this separately for `/tpa` and `/tpahere`.
-   **Manual Confirmation**: If auto-accept is disabled, the addon displays a user-friendly, clickable `[ACCEPT]` button.
-   **Message Visibility Control**: Choose whether to see the original TPA request message in your chat or to hide it for a cleaner experience.
-   **Player Name Toggling**: Option to hide the player's name in the custom TPA message for compatibility with other addons like `CustomNameTags`.
-   **Custom Sound Notifications**: Get notified of a new TPA request with a sound. You can enable/disable the sound, choose from a variety of in-game sounds, and adjust the volume and pitch.
-   **Fully Configurable**: All features are neatly organized in the LabyMod addon settings.

## Installation

1.  Go to the [**Releases**](https://github.com/Oljver/AutoTpaAccept/releases) page of this repository.
2.  Download the latest `.jar` file.
3.  Move the downloaded `.jar` file into your LabyMod 4 addons folder.
    -   The folder is typically located at `%appdata%\.minecraft\labymod-neo\addons` on Windows.
4.  Restart your Minecraft client.

## Configuration

You can configure the addon directly in your LabyMod settings:

1.  Navigate to `LabyMod` > `Settings`.
2.  Find **Auto TPA Accept** in the list and click on it.
3.  Here you can configure the following options under different sections:

    -   **`Enabled`**: A master switch to turn the entire addon on or off.

    ### Auto Accept Settings
    -   **`Auto-Accept /tpa`**: When enabled, all `/tpa` requests will be accepted automatically.
    -   **`Auto-Accept /tpahere`**: When enabled, all `/tpahere` requests will be accepted automatically.

    ### Message Settings
    -   **`Show Original Message`**: Controls the visibility of the original server message for the TPA request.
        -   **ON**: The original message will be displayed in chat.
        -   **OFF**: The original message will be hidden to reduce clutter.
    - **`Show Player Name`**: Toggles the display of the player's name in the custom TPA message.
        -   **ON**: The message will be, for example, "TPA request from Steve."
        -   **OFF**: The message will be generic, e.g., "A TPA request was detected." This should be used for compatibility with addons like `CustomNameTags`.
        -   **CRITICAL NOTE for `CustomNameTags` Users:** For the TPA detection to work with the `CustomNameTags` addon, you **MUST** meet **BOTH** of the following conditions:
            1.  **Disable** the "Show Player Name" option in this addon.
            2.  Ensure your custom tag format in the `CustomNameTags` addon **starts** with the player's name (e.g., `<playername> [TAG]`).
            -   The addon will not work correctly with `CustomNameTags` if both conditions are not met.

    ### Play Sound Settings
    -   **`Play Sound`**: A master switch for sound notifications.
    -   **`Volume`**: Adjust the volume of the notification sound.
    -   **`Pitch`**: Adjust the pitch of the notification sound.
    -   **`Sound`**: Choose your preferred notification sound from a dropdown list.