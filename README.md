# Auto TPA Accept

A simple but effective LabyMod 4 addon designed to streamline the process of accepting teleport requests (`/tpa`). This addon helps you manage incoming TPA requests by either automatically accepting them or providing a clean, one-click button directly in your chat.

## Features

- **TPA Request Detection**: Automatically detects `/tpa accept <playername>` commands in incoming chat messages.
- **Auto-Accept Mode**: When enabled, the addon instantly accepts any detected TPA request and sends a confirmation message to your chat.
- **Manual Confirmation**: If auto-accept is disabled, the addon displays a user-friendly, clickable `[ACCEPT]` button, preventing chat clutter.
- **Fully Configurable**: Easily enable or disable the addon and switch between modes through the LabyMod addon settings.

## Installation

1.  Go to the [**Releases**](https://github.com/Oljver/AutoTpaAccept/releases) page of this repository.
2.  Download the latest `.jar` file.
3.  Move the downloaded `.jar` file to your LabyMod 4 addons folder.
    - The folder is typically located at `%appdata%\.minecraft\labymod-neo\addons` on Windows.
4.  Restart your Minecraft client.

## Configuration

You can configure the addon directly in your LabyMod settings:

1.  Navigate to `LabyMod` > `Addons`.
2.  Find **Auto TPA Accept** in the list and click on it.
3.  Here you can configure the following options:
    - **`Enabled`**: A master switch to turn the entire addon on or off.
    - **`Auto-Accept TPA`**: Toggles the primary mode.
      - **`ON`**: All TPA requests will be accepted automatically.
      - **`OFF`**: A clickable `[ACCEPT]` button will be shown for each request.
