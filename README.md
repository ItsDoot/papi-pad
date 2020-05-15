# papi-pad

A simple PlaceholderAPI expansion that adds padding placeholders. When the value of the inner placeholder is not an empty text, these placeholders pad the resulting text with spaces on the left or right.

## Usage

Normally, you may use `%player_name%`.

To pad it with 1 space on the left, use `%pad_left_player_name%`.

To pad it with 1 space on the right, use `%pad_right_player_name%`.

To pad it with multiple spaces, you can chain it like so: `%pad_left_pad_left_player_name%`.
This will pad the player's name with 2 spaces on the left.