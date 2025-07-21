# Auto TPA Accept

A simple but effective LabyMod 4 addon designed to streamline the process of accepting teleport requests (`/tpa`). This addon gives you full control over incoming TPA requests by either automatically accepting them, providing a clean one-click button, or hiding them completely, all accompanied by customizable sound notifications.

## Features

-   **TPA Request Detection**: Automatically detects `/tpa accept <playername>` commands in incoming chat messages.
-   **Auto-Accept Mode**: When enabled, the addon instantly accepts any detected TPA request and sends a confirmation message to your chat.
-   **Manual Confirmation**: If auto-accept is disabled, the addon displays a user-friendly, clickable `[ACCEPT]` button.
-   **Message Visibility Control**: Choose whether to see the original TPA request message in your chat or to hide it for a cleaner experience.
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
    -   **`Auto-Accept TPA`**: Toggles the primary mode.
        -   **ON**: All TPA requests will be accepted automatically.
        -   **OFF**: A clickable `[ACCEPT]` button will be shown for each request.

    ### Message Settings
    -   **`Show Original Message`**: Controls the visibility of the original server message for the TPA request.
        -   **ON**: The original message will be displayed in chat.
        -   **OFF**: The original message will be hidden to reduce clutter.

    ### Play Sound Settings
    -   **`Play Sound`**: A master switch for sound notifications.
    -   **`Volume`**: Adjust the volume of the notification sound.
    -   **`Pitch`**: Adjust the pitch of the notification sound.
    -   **`Sound`**: Choose your preferred notification sound from a dropdown list.
