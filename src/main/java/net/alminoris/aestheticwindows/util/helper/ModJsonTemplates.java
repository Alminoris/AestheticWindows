package net.alminoris.aestheticwindows.util.helper;

public class ModJsonTemplates
{
    public static String YAXIS_ROTATED_BLOCKSTATE_TEMPLATE = """
            {
              "variants": {
                "facing=north": { "model": "aestheticwindows:block/NAME" },
                "facing=south": { "model": "aestheticwindows:block/NAME", "y": 180 },
                "facing=west": { "model": "aestheticwindows:block/NAME", "y": 270 },
                "facing=east": { "model": "aestheticwindows:block/NAME", "y": 90 }
              }
            }
            """;

    public static String SIMPLE_WINDOW_BLOCKSTATE_TEMPLATE = """
            {
              "variants": {
                "facing=north,variant=normal,open=false": { "model": "aestheticwindows:block/NAME" },
                "facing=south,variant=normal,open=false": { "model": "aestheticwindows:block/NAME", "y": 180 },
                "facing=west,variant=normal,open=false": { "model": "aestheticwindows:block/NAME", "y": 270 },
                "facing=east,variant=normal,open=false": { "model": "aestheticwindows:block/NAME", "y": 90 },
                "facing=north,variant=center,open=false": { "model": "aestheticwindows:block/NAME_center" },
                "facing=south,variant=center,open=false": { "model": "aestheticwindows:block/NAME_center", "y": 180 },
                "facing=west,variant=center,open=false": { "model": "aestheticwindows:block/NAME_center", "y": 270 },
                "facing=east,variant=center,open=false": { "model": "aestheticwindows:block/NAME_center", "y": 90 },
                "facing=north,variant=left,open=false": { "model": "aestheticwindows:block/NAME_left" },
                "facing=south,variant=left,open=false": { "model": "aestheticwindows:block/NAME_left", "y": 180 },
                "facing=west,variant=left,open=false": { "model": "aestheticwindows:block/NAME_left", "y": 270 },
                "facing=east,variant=left,open=false": { "model": "aestheticwindows:block/NAME_left", "y": 90 },
                "facing=north,variant=right,open=false": { "model": "aestheticwindows:block/NAME_right" },
                "facing=south,variant=right,open=false": { "model": "aestheticwindows:block/NAME_right", "y": 180 },
                "facing=west,variant=right,open=false": { "model": "aestheticwindows:block/NAME_right", "y": 270 },
                "facing=east,variant=right,open=false": { "model": "aestheticwindows:block/NAME_right", "y": 90 },
                "facing=north,variant=normal,open=true": { "model": "aestheticwindows:block/NAME_open" },
                "facing=south,variant=normal,open=true": { "model": "aestheticwindows:block/NAME_open", "y": 180 },
                "facing=west,variant=normal,open=true": { "model": "aestheticwindows:block/NAME_open", "y": 270 },
                "facing=east,variant=normal,open=true": { "model": "aestheticwindows:block/NAME_open", "y": 90 },
                "facing=north,variant=center,open=true": { "model": "aestheticwindows:block/NAME_open_center" },
                "facing=south,variant=center,open=true": { "model": "aestheticwindows:block/NAME_open_center", "y": 180 },
                "facing=west,variant=center,open=true": { "model": "aestheticwindows:block/NAME_open_center", "y": 270 },
                "facing=east,variant=center,open=true": { "model": "aestheticwindows:block/NAME_open_center", "y": 90 },
                "facing=north,variant=left,open=true": { "model": "aestheticwindows:block/NAME_open_left" },
                "facing=south,variant=left,open=true": { "model": "aestheticwindows:block/NAME_open_left", "y": 180 },
                "facing=west,variant=left,open=true": { "model": "aestheticwindows:block/NAME_open_left", "y": 270 },
                "facing=east,variant=left,open=true": { "model": "aestheticwindows:block/NAME_open_left", "y": 90 },
                "facing=north,variant=right,open=true": { "model": "aestheticwindows:block/NAME_open_right" },
                "facing=south,variant=right,open=true": { "model": "aestheticwindows:block/NAME_open_right", "y": 180 },
                "facing=west,variant=right,open=true": { "model": "aestheticwindows:block/NAME_open_right", "y": 270 },
                "facing=east,variant=right,open=true": { "model": "aestheticwindows:block/NAME_open_right", "y": 90 }
              }
            }
            """;

    public static String VERTICAL_WINDOW_BLOCKSTATE_TEMPLATE = """
            {
              "variants": {
                "facing=north,variant=normal,open=false,flipped=false": { "model": "aestheticwindows:block/NAME", "y": 0  },
                "facing=south,variant=normal,open=false,flipped=false": { "model": "aestheticwindows:block/NAME", "y": 180 },
                "facing=west,variant=normal,open=false,flipped=false": { "model": "aestheticwindows:block/NAME", "y": 270 },
                "facing=east,variant=normal,open=false,flipped=false": { "model": "aestheticwindows:block/NAME", "y": 90 },
                "facing=north,variant=center,open=false,flipped=false": { "model": "aestheticwindows:block/NAME_center", "y": 0  },
                "facing=south,variant=center,open=false,flipped=false": { "model": "aestheticwindows:block/NAME_center", "y": 180 },
                "facing=west,variant=center,open=false,flipped=false": { "model": "aestheticwindows:block/NAME_center", "y": 270 },
                "facing=east,variant=center,open=false,flipped=false": { "model": "aestheticwindows:block/NAME_center", "y": 90 },
                "facing=north,variant=up,open=false,flipped=false": { "model": "aestheticwindows:block/NAME_up", "y": 0  },
                "facing=south,variant=up,open=false,flipped=false": { "model": "aestheticwindows:block/NAME_up", "y": 180 },
                "facing=west,variant=up,open=false,flipped=false": { "model": "aestheticwindows:block/NAME_up", "y": 270 },
                "facing=east,variant=up,open=false,flipped=false": { "model": "aestheticwindows:block/NAME_up", "y": 90 },
                "facing=north,variant=down,open=false,flipped=false": { "model": "aestheticwindows:block/NAME_down", "y": 0  },
                "facing=south,variant=down,open=false,flipped=false": { "model": "aestheticwindows:block/NAME_down", "y": 180 },
                "facing=west,variant=down,open=false,flipped=false": { "model": "aestheticwindows:block/NAME_down", "y": 270 },
                "facing=east,variant=down,open=false,flipped=false": { "model": "aestheticwindows:block/NAME_down", "y": 90 },
                "facing=north,variant=normal,open=true,flipped=false": { "model": "aestheticwindows:block/NAME_open", "y": 0  },
                "facing=south,variant=normal,open=true,flipped=false": { "model": "aestheticwindows:block/NAME_open", "y": 180 },
                "facing=west,variant=normal,open=true,flipped=false": { "model": "aestheticwindows:block/NAME_open", "y": 270 },
                "facing=east,variant=normal,open=true,flipped=false": { "model": "aestheticwindows:block/NAME_open", "y": 90 },
                "facing=north,variant=center,open=true,flipped=false": { "model": "aestheticwindows:block/NAME_open_center", "y": 0  },
                "facing=south,variant=center,open=true,flipped=false": { "model": "aestheticwindows:block/NAME_open_center", "y": 180 },
                "facing=west,variant=center,open=true,flipped=false": { "model": "aestheticwindows:block/NAME_open_center", "y": 270 },
                "facing=east,variant=center,open=true,flipped=false": { "model": "aestheticwindows:block/NAME_open_center", "y": 90 },
                "facing=north,variant=up,open=true,flipped=false": { "model": "aestheticwindows:block/NAME_open_up", "y": 0  },
                "facing=south,variant=up,open=true,flipped=false": { "model": "aestheticwindows:block/NAME_open_up", "y": 180 },
                "facing=west,variant=up,open=true,flipped=false": { "model": "aestheticwindows:block/NAME_open_up", "y": 270 },
                "facing=east,variant=up,open=true,flipped=false": { "model": "aestheticwindows:block/NAME_open_up", "y": 90 },
                "facing=north,variant=down,open=true,flipped=false": { "model": "aestheticwindows:block/NAME_open_down", "y": 0  },
                "facing=south,variant=down,open=true,flipped=false": { "model": "aestheticwindows:block/NAME_open_down", "y": 180 },
                "facing=west,variant=down,open=true,flipped=false": { "model": "aestheticwindows:block/NAME_open_down", "y": 270 },
                "facing=east,variant=down,open=true,flipped=false": { "model": "aestheticwindows:block/NAME_open_down", "y": 90 },
                
                "facing=north,variant=normal,open=false,flipped=true": { "model": "aestheticwindows:block/NAME_flipped", "y": 0  },
                "facing=south,variant=normal,open=false,flipped=true": { "model": "aestheticwindows:block/NAME_flipped", "y": 180 },
                "facing=west,variant=normal,open=false,flipped=true": { "model": "aestheticwindows:block/NAME_flipped", "y": 270 },
                "facing=east,variant=normal,open=false,flipped=true": { "model": "aestheticwindows:block/NAME_flipped", "y": 90 },
                "facing=north,variant=center,open=false,flipped=true": { "model": "aestheticwindows:block/NAME_center_flipped", "y": 0  },
                "facing=south,variant=center,open=false,flipped=true": { "model": "aestheticwindows:block/NAME_center_flipped", "y": 180 },
                "facing=west,variant=center,open=false,flipped=true": { "model": "aestheticwindows:block/NAME_center_flipped", "y": 270 },
                "facing=east,variant=center,open=false,flipped=true": { "model": "aestheticwindows:block/NAME_center_flipped", "y": 90 },
                "facing=north,variant=up,open=false,flipped=true": { "model": "aestheticwindows:block/NAME_up_flipped", "y": 0  },
                "facing=south,variant=up,open=false,flipped=true": { "model": "aestheticwindows:block/NAME_up_flipped", "y": 180 },
                "facing=west,variant=up,open=false,flipped=true": { "model": "aestheticwindows:block/NAME_up_flipped", "y": 270 },
                "facing=east,variant=up,open=false,flipped=true": { "model": "aestheticwindows:block/NAME_up_flipped", "y": 90 },
                "facing=north,variant=down,open=false,flipped=true": { "model": "aestheticwindows:block/NAME_down_flipped", "y": 0  },
                "facing=south,variant=down,open=false,flipped=true": { "model": "aestheticwindows:block/NAME_down_flipped", "y": 180 },
                "facing=west,variant=down,open=false,flipped=true": { "model": "aestheticwindows:block/NAME_down_flipped", "y": 270 },
                "facing=east,variant=down,open=false,flipped=true": { "model": "aestheticwindows:block/NAME_down_flipped", "y": 90 },
                "facing=north,variant=normal,open=true,flipped=true": { "model": "aestheticwindows:block/NAME_open_flipped", "y": 0  },
                "facing=south,variant=normal,open=true,flipped=true": { "model": "aestheticwindows:block/NAME_open_flipped", "y": 180 },
                "facing=west,variant=normal,open=true,flipped=true": { "model": "aestheticwindows:block/NAME_open_flipped", "y": 270 },
                "facing=east,variant=normal,open=true,flipped=true": { "model": "aestheticwindows:block/NAME_open_flipped", "y": 90 },
                "facing=north,variant=center,open=true,flipped=true": { "model": "aestheticwindows:block/NAME_open_center_flipped", "y": 0  },
                "facing=south,variant=center,open=true,flipped=true": { "model": "aestheticwindows:block/NAME_open_center_flipped", "y": 180 },
                "facing=west,variant=center,open=true,flipped=true": { "model": "aestheticwindows:block/NAME_open_center_flipped", "y": 270 },
                "facing=east,variant=center,open=true,flipped=true": { "model": "aestheticwindows:block/NAME_open_center_flipped", "y": 90 },
                "facing=north,variant=up,open=true,flipped=true": { "model": "aestheticwindows:block/NAME_open_up_flipped", "y": 0  },
                "facing=south,variant=up,open=true,flipped=true": { "model": "aestheticwindows:block/NAME_open_up_flipped", "y": 180 },
                "facing=west,variant=up,open=true,flipped=true": { "model": "aestheticwindows:block/NAME_open_up_flipped", "y": 270 },
                "facing=east,variant=up,open=true,flipped=true": { "model": "aestheticwindows:block/NAME_open_up_flipped", "y": 90 },
                "facing=north,variant=down,open=true,flipped=true": { "model": "aestheticwindows:block/NAME_open_down_flipped", "y": 0  },
                "facing=south,variant=down,open=true,flipped=true": { "model": "aestheticwindows:block/NAME_open_down_flipped", "y": 180 },
                "facing=west,variant=down,open=true,flipped=true": { "model": "aestheticwindows:block/NAME_open_down_flipped", "y": 270 },
                "facing=east,variant=down,open=true,flipped=true": { "model": "aestheticwindows:block/NAME_open_down_flipped", "y": 90 }
              }
            }
            """;

    public static String WINDOW = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.5],
              			"to": [1, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.5],
              			"to": [16, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 1, 7],
              			"to": [2, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [14, 1, 7],
              			"to": [15, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 1, 7],
              			"to": [14, 2, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 14, 7],
              			"to": [14, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 2, 7.5],
              			"to": [14, 14, 8.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
              				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
              				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
              				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
              				"up": {"uv": [0, 0, 12, 1], "texture": "#1"},
              				"down": {"uv": [0, 0, 12, 1], "texture": "#1"}
              			}
              		},
              		{
              			"from": [1.25, 6, 8.5],
              			"to": [2.25, 10, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 6, 8.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
              				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
              			}
              		}
              	],
              	"display": {
              		"thirdperson_righthand": {
              			"translation": [2.5, 2, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"thirdperson_lefthand": {
              			"translation": [2.5, 2, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_righthand": {
              			"translation": [0.75, 3.75, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_lefthand": {
              			"translation": [0.75, 3.75, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"ground": {
              			"translation": [0, 2, 0],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"gui": {
              			"rotation": [20, -45, 0],
              			"scale": [0.6, 0.6, 0.6]
              		},
              		"fixed": {
              			"rotation": [180, 0, 180],
              			"translation": [0, 0, 0.5],
              			"scale": [0.5, 0.5, 0.5]
              		}
              	}
            }
            """;

    public static String WINDOW_CENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.75],
              			"to": [1, 15, 9.25],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.75],
              			"to": [16, 15, 9.25],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [14, 1, 7],
              			"to": [15, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 1, 7],
              			"to": [2, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 1, 7],
              			"to": [14, 2, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
              			"faces": {
              				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 14, 7],
              			"to": [14, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
              			"faces": {
              				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 2, 7.5],
              			"to": [14, 14, 8.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
              			"faces": {
              				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
              				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
              				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
              				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
              				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
              				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
              			}
              		}
              	]
            }
            """;

    public static String WINDOW_LEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.5],
              			"to": [1, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.75],
              			"to": [16, 15, 9.25],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [14, 1, 7],
              			"to": [15, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 1, 7],
              			"to": [2, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 1, 7],
              			"to": [14, 2, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
              			"faces": {
              				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 14, 7],
              			"to": [14, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
              			"faces": {
              				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 2, 7.5],
              			"to": [14, 14, 8.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
              			"faces": {
              				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
              				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
              				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
              				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
              				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
              				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
              			}
              		},
              		{
              			"from": [13.75, 6, 8.5],
              			"to": [14.75, 10, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 6, 8.5]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
              				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
              				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
              				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
              				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
              				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
              			}
              		}
              	]
            }
            """;

    public static String WINDOW_RIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.75],
              			"to": [1, 15, 9.25],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.5],
              			"to": [16, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 1, 7],
              			"to": [2, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [14, 1, 7],
              			"to": [15, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 1, 7],
              			"to": [14, 2, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 14, 7],
              			"to": [14, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 2, 7.5],
              			"to": [14, 14, 8.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
              				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
              				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
              				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
              				"up": {"uv": [0, 0, 12, 1], "texture": "#1"},
              				"down": {"uv": [0, 0, 12, 1], "texture": "#1"}
              			}
              		},
              		{
              			"from": [1.25, 6, 8.5],
              			"to": [2.25, 10, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 6, 8.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
              				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
              			}
              		}
              	]
            }
            """;

    public static String WINDOW_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.5],
              			"to": [1, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.5],
              			"to": [16, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 7.5],
              			"to": [12.5, 15, 8.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 20.5],
              			"to": [12.5, 15, 21.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 8.5],
              			"to": [12.5, 2, 20.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 14, 8.5],
              			"to": [12.5, 15, 20.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [11, 2, 8.5],
              			"to": [12, 14, 20.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
              				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
              				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
              				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
              				"up": {"uv": [12, 1, 0, 0], "rotation": 270, "texture": "#1"},
              				"down": {"uv": [12, 1, 0, 0], "rotation": 90, "texture": "#1"}
              			}
              		},
              		{
              			"from": [12, 6, 20.25],
              			"to": [13, 10, 21.25],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
              				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
              			}
              		}
              	],
              	"groups": [
              		0,
              		1,
              		2,
              		3,
              		{
              			"name": "door",
              			"origin": [8, 8, 7.5],
              			"color": 0,
              			"children": [4, 5, 6, 7, 8, 9]
              		}
              	]
            }
            """;

    public static String WINDOW_OPEN_CENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.75],
              			"to": [1, 15, 9.25],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.75],
              			"to": [16, 15, 9.25],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [14, 1, 7],
              			"to": [15, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 1, 7],
              			"to": [2, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 1, 7],
              			"to": [14, 2, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
              			"faces": {
              				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 14, 7],
              			"to": [14, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
              			"faces": {
              				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 2, 7.5],
              			"to": [14, 14, 8.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
              			"faces": {
              				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
              				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
              				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
              				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
              				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
              				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
              			}
              		}
              	]
            }
            """;

    public static String WINDOW_OPEN_LEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.5],
              			"to": [1, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.75],
              			"to": [16, 15, 9.25],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 8.5, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 8.5, 15], "texture": "#0"},
              				"up": {"uv": [7, 8, 8, 10.5], "texture": "#0"},
              				"down": {"uv": [7, 8, 8, 10.5], "texture": "#0"}
              			}
              		},
              		{
              			"from": [3.5, 1, 7.5],
              			"to": [5.5, 15, 8.5],
              			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [3.5, 1, 20.5],
              			"to": [5.5, 15, 21.5],
              			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [3.5, 1, 8.5],
              			"to": [5.5, 2, 20.5],
              			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [3.5, 14, 8.5],
              			"to": [5.5, 15, 20.5],
              			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [4, 2, 8.5],
              			"to": [5, 14, 20.5],
              			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
              				"east": {"uv": [16, 0, 0, 16], "texture": "#1"},
              				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
              				"west": {"uv": [16, 0, 0, 16], "texture": "#1"},
              				"up": {"uv": [12, 0, 0, 1], "rotation": 270, "texture": "#1"},
              				"down": {"uv": [12, 0, 0, 1], "rotation": 90, "texture": "#1"}
              			}
              		},
              		{
              			"from": [3, 6, 20.25],
              			"to": [4, 10, 21.25],
              			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
              				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
              				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
              				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
              				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
              				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
              			}
              		}
              	],
              	"groups": [
              		0,
              		1,
              		2,
              		3,
              		{
              			"name": "door",
              			"origin": [8, 8, 7.5],
              			"color": 0,
              			"children": [4, 5, 6, 7, 8, 9]
              		}
              	]
            }
            """;

    public static String WINDOW_OPEN_RIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.75],
              			"to": [1, 15, 9.25],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 8.5, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 8.5, 15], "texture": "#0"},
              				"up": {"uv": [7, 8, 8, 10.5], "texture": "#0"},
              				"down": {"uv": [7, 8, 8, 10.5], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.5],
              			"to": [16, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 7.5],
              			"to": [12.5, 15, 8.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 20.5],
              			"to": [12.5, 15, 21.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 8.5],
              			"to": [12.5, 2, 20.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 14, 8.5],
              			"to": [12.5, 15, 20.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [11, 2, 8.5],
              			"to": [12, 14, 20.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
              				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
              				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
              				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
              				"up": {"uv": [12, 1, 0, 0], "rotation": 270, "texture": "#1"},
              				"down": {"uv": [12, 1, 0, 0], "rotation": 90, "texture": "#1"}
              			}
              		},
              		{
              			"from": [12, 6, 20.25],
              			"to": [13, 10, 21.25],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
              				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
              			}
              		}
              	],
              	"groups": [
              		0,
              		1,
              		2,
              		3,
              		{
              			"name": "door",
              			"origin": [8, 8, 7.5],
              			"color": 0,
              			"children": [4, 5, 6, 7, 8, 9]
              		}
              	]
            }
            """;

    public static String VERTICAL_WINDOW = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.5],
              			"to": [1, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.5],
              			"to": [16, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 1, 7],
              			"to": [2, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [14, 1, 7],
              			"to": [15, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 1, 7],
              			"to": [14, 2, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 14, 7],
              			"to": [14, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 2, 7.5],
              			"to": [14, 14, 8.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
              				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
              				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
              				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
              				"up": {"uv": [0, 0, 12, 1], "texture": "#1"},
              				"down": {"uv": [0, 0, 12, 1], "texture": "#1"}
              			}
              		},
              		{
              			"from": [1.25, 6, 8.5],
              			"to": [2.25, 10, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 6, 8.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
              				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
              			}
              		}
              	],
              	"display": {
              		"thirdperson_righthand": {
              			"translation": [2.5, 2, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"thirdperson_lefthand": {
              			"translation": [2.5, 2, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_righthand": {
              			"translation": [0.75, 3.75, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_lefthand": {
              			"translation": [0.75, 3.75, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"ground": {
              			"translation": [0, 2, 0],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"gui": {
              			"rotation": [20, -45, 0],
              			"scale": [0.6, 0.6, 0.6]
              		},
              		"fixed": {
              			"rotation": [180, 0, 180],
              			"translation": [0, 0, 0.5],
              			"scale": [0.5, 0.5, 0.5]
              		}
              	}
            }
            """;

    public static String VERTICAL_WINDOW_CENTER = """
            {
             	"credit": "Made with Blockbench",
             	"textures": {
             		"0": "BASE_NAME",
             		"1": "GLASS_NAME",
             		"2": "HANDLE_NAME",
             		"particle": "BASE_NAME"
             	},
             	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [1, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
              				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
              				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
              				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 0, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
              				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
              				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
              				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 0, 7],
              			"to": [2, 16, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 16], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 16], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 16], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 16], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [14, 0, 7],
              			"to": [15, 16, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 16], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 16], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 16], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 16], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 0, 7.5],
              			"to": [14, 16, 8.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 1, 16, 15], "texture": "#1"},
              				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
              				"south": {"uv": [0, 1, 16, 15], "texture": "#1"},
              				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
              				"up": {"uv": [2, 7, 14, 8], "texture": "#1"},
              				"down": {"uv": [2, 7, 14, 8], "texture": "#1"}
              			}
              		},
              		{
              			"from": [1.25, 0, 8.5],
              			"to": [2.25, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 12, 8.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 16], "texture": "#2"},
              				"east": {"uv": [0, 0, 1, 16], "texture": "#2"},
              				"south": {"uv": [0, 0, 1, 16], "texture": "#2"},
              				"west": {"uv": [0, 0, 1, 16], "texture": "#2"},
              				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
              				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
              			}
              		}
              	],
              	"display": {
              		"thirdperson_righthand": {
              			"translation": [2.5, 2, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"thirdperson_lefthand": {
              			"translation": [2.5, 2, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_righthand": {
              			"translation": [0.75, 3.75, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_lefthand": {
              			"translation": [0.75, 3.75, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"ground": {
              			"translation": [0, 2, 0],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"gui": {
              			"rotation": [20, -45, 0],
              			"scale": [0.6, 0.6, 0.6]
              		},
              		"fixed": {
              			"rotation": [180, 0, 180],
              			"translation": [0, 0, 0.5],
              			"scale": [0.5, 0.5, 0.5]
              		}
              	}
            }
            """;

    public static String VERTICAL_WINDOW_UP = """
            {
             	"credit": "Made with Blockbench",
             	"textures": {
             		"0": "BASE_NAME",
             		"1": "GLASS_NAME",
             		"2": "HANDLE_NAME",
             		"particle": "BASE_NAME"
             	},
             	"elements": [
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 0, 6.5],
              			"to": [1, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 14], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 14], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 14], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 14], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 0, 6.5],
              			"to": [16, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 14], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 14], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 14], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 14], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 0, 7],
              			"to": [2, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 15], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 15], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [14, 0, 7],
              			"to": [15, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 15], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 15], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 14, 7],
              			"to": [14, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 0, 7.5],
              			"to": [14, 14, 8.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 15], "texture": "#1"},
              				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
              				"south": {"uv": [0, 0, 16, 15], "texture": "#1"},
              				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
              				"up": {"uv": [2, 6, 14, 7], "texture": "#1"},
              				"down": {"uv": [2, 6, 14, 7], "texture": "#1"}
              			}
              		},
              		{
              			"from": [1.25, 0, 8.5],
              			"to": [2.25, 4, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 0, 8.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
              				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
              			}
              		}
              	],
              	"display": {
              		"thirdperson_righthand": {
              			"translation": [2.5, 2, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"thirdperson_lefthand": {
              			"translation": [2.5, 2, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_righthand": {
              			"translation": [0.75, 3.75, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_lefthand": {
              			"translation": [0.75, 3.75, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"ground": {
              			"translation": [0, 2, 0],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"gui": {
              			"rotation": [20, -45, 0],
              			"scale": [0.6, 0.6, 0.6]
              		},
              		"fixed": {
              			"rotation": [180, 0, 180],
              			"translation": [0, 0, 0.5],
              			"scale": [0.5, 0.5, 0.5]
              		}
              	}
            }
            """;

    public static String VERTICAL_WINDOW_DOWN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 2, 7.5],
             			"to": [14, 16, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [2, 7, 14, 8], "texture": "#1"},
             				"down": {"uv": [2, 7, 14, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1.25, 12, 8.5],
             			"to": [2.25, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 12, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
             				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String VERTICAL_WINDOW_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.5],
              			"to": [1, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.5],
              			"to": [16, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 7.5],
              			"to": [12.5, 15, 8.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 20.5],
              			"to": [12.5, 15, 21.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 8.5],
              			"to": [12.5, 2, 20.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 14, 8.5],
              			"to": [12.5, 15, 20.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [11, 2, 8.5],
              			"to": [12, 14, 20.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
              				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
              				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
              				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
              				"up": {"uv": [12, 1, 0, 0], "rotation": 270, "texture": "#1"},
              				"down": {"uv": [12, 1, 0, 0], "rotation": 90, "texture": "#1"}
              			}
              		},
              		{
              			"from": [12, 6, 20.25],
              			"to": [13, 10, 21.25],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
              				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
              			}
              		}
              	],
              	"groups": [
              		0,
              		1,
              		2,
              		3,
              		{
              			"name": "door",
              			"origin": [8, 8, 7.5],
              			"color": 0,
              			"children": [4, 5, 6, 7, 8, 9]
              		}
              	]
            }
            """;

    public static String VERTICAL_WINDOW_OPEN_CENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 0, 7.5],
             			"to": [12.5, 16, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 0, 20.5],
             			"to": [12.5, 16, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [11, 0, 8.5],
             			"to": [12, 16, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 1, 16, 15], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 1, 16, 15], "texture": "#1"},
             				"up": {"uv": [14, 8, 2, 7], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 8, 2, 7], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [12, 0, 20.25],
             			"to": [13, 16, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 15, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [2, 3, 4, 5]
             		}
             	]
            }
            """;

    public static String VERTICAL_WINDOW_OPEN_UP = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 0, 7.5],
             			"to": [12.5, 15, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 0, 20.5],
             			"to": [12.5, 15, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 14, 8.5],
             			"to": [12.5, 15, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [11, 0, 8.5],
             			"to": [12, 14, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 6], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 6], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [12, 0, 20.25],
             			"to": [13, 4, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 3, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [3, 4, 5, 6, 7]
             		}
             	]
            }
            """;

    public static String VERTICAL_WINDOW_OPEN_DOWN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 7.5],
             			"to": [12.5, 16, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 20.5],
             			"to": [12.5, 16, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 8.5],
             			"to": [12.5, 2, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [11, 2, 8.5],
             			"to": [12, 16, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"up": {"uv": [14, 8, 2, 7], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 8, 2, 7], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [12, 12, 20.25],
             			"to": [13, 16, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 14, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [3, 4, 5, 6, 7]
             		}
             	]
            }
            """;

    public static String VERTICAL_WINDOW_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 6.5],
            			"to": [16, 1, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 15, 6.5],
            			"to": [16, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 1, 6.5],
            			"to": [1, 15, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
            				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
            				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
            				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 1, 6.5],
            			"to": [16, 15, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
            				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
            				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
            				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14, 1, 7],
            			"to": [15, 15, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
            				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 1, 7],
            			"to": [2, 15, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
            				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 1, 7],
            			"to": [14, 2, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
            			"faces": {
            				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 14, 7],
            			"to": [14, 15, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
            			"faces": {
            				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 2, 7.5],
            			"to": [14, 14, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
            			"faces": {
            				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
            				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
            				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
            				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
            				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
            				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13.75, 6, 8.5],
            			"to": [14.75, 10, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 6, 8.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2.5, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2.5, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.75, 3.75, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.75, 3.75, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String VERTICAL_WINDOW_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 6.5],
            			"to": [16, 1, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 15, 6.5],
            			"to": [16, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 1, 6.5],
            			"to": [1, 15, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
            				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
            				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
            				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 1, 6.5],
            			"to": [16, 15, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
            				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
            				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
            				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 1, 7.5],
            			"to": [5.5, 15, 8.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
            				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
            				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 1, 20.5],
            			"to": [5.5, 15, 21.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
            				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
            				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 1, 8.5],
            			"to": [5.5, 2, 20.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 14, 8.5],
            			"to": [5.5, 15, 20.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [4, 2, 8.5],
            			"to": [5, 14, 20.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
            				"east": {"uv": [16, 0, 0, 16], "texture": "#1"},
            				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
            				"west": {"uv": [16, 0, 0, 16], "texture": "#1"},
            				"up": {"uv": [12, 0, 0, 1], "rotation": 270, "texture": "#1"},
            				"down": {"uv": [12, 0, 0, 1], "rotation": 90, "texture": "#1"}
            			}
            		},
            		{
            			"from": [3, 6, 20.25],
            			"to": [4, 10, 21.25],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
            			}
            		}
            	],
            	"groups": [
            		0,
            		1,
            		2,
            		3,
            		{
            			"name": "door",
            			"origin": [8, 8, 7.5],
            			"color": 0,
            			"children": [4, 5, 6, 7, 8, 9]
            		}
            	]
            }
            """;

    public static String VERTICAL_WINDOW_CENTER_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 6.5],
            			"to": [1, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
            				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
            				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
            				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 0, 6.5],
            			"to": [16, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
            				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
            				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
            				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14, 0, 7],
            			"to": [15, 16, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 16], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 16], "texture": "#0"},
            				"south": {"uv": [1, 0, 0, 16], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 16], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 0, 7],
            			"to": [2, 16, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 16], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 16], "texture": "#0"},
            				"south": {"uv": [1, 0, 0, 16], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 16], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 7.5],
            			"to": [14, 16, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
            			"faces": {
            				"north": {"uv": [16, 1, 0, 15], "texture": "#1"},
            				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
            				"south": {"uv": [16, 1, 0, 15], "texture": "#1"},
            				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
            				"up": {"uv": [14, 7, 2, 8], "texture": "#1"},
            				"down": {"uv": [14, 7, 2, 8], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13.75, 0, 8.5],
            			"to": [14.75, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 12, 8.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 16], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 16], "texture": "#2"},
            				"south": {"uv": [1, 0, 0, 16], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 16], "texture": "#2"},
            				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2.5, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2.5, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.75, 3.75, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.75, 3.75, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String VERTICAL_WINDOW_CENTER_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 6.5],
            			"to": [1, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
            				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
            				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
            				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 0, 6.5],
            			"to": [16, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
            				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
            				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
            				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 0, 7.5],
            			"to": [5.5, 16, 8.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 16], "texture": "#0"},
            				"east": {"uv": [1, 0, 0, 16], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 16], "texture": "#0"},
            				"west": {"uv": [1, 0, 0, 16], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 0, 20.5],
            			"to": [5.5, 16, 21.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 16], "texture": "#0"},
            				"east": {"uv": [1, 0, 0, 16], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 16], "texture": "#0"},
            				"west": {"uv": [1, 0, 0, 16], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [4, 0, 8.5],
            			"to": [5, 16, 20.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
            				"east": {"uv": [16, 1, 0, 15], "texture": "#1"},
            				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
            				"west": {"uv": [16, 1, 0, 15], "texture": "#1"},
            				"up": {"uv": [14, 7, 2, 8], "rotation": 270, "texture": "#1"},
            				"down": {"uv": [14, 7, 2, 8], "rotation": 90, "texture": "#1"}
            			}
            		},
            		{
            			"from": [3, 0, 20.25],
            			"to": [4, 16, 21.25],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 15, 14.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 16], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 16], "texture": "#2"},
            				"south": {"uv": [1, 0, 0, 16], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 16], "texture": "#2"},
            				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
            			}
            		}
            	],
            	"groups": [
            		0,
            		1,
            		{
            			"name": "door",
            			"origin": [8, 8, 7.5],
            			"color": 0,
            			"children": [2, 3, 4, 5]
            		}
            	]
            }
            """;

    public static String VERTICAL_WINDOW_UP_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 15, 6.5],
            			"to": [16, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 6.5],
            			"to": [1, 15, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 1, 8, 14], "texture": "#0"},
            				"east": {"uv": [6, 1, 9, 14], "texture": "#0"},
            				"south": {"uv": [7, 1, 8, 14], "texture": "#0"},
            				"west": {"uv": [6, 1, 9, 14], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 0, 6.5],
            			"to": [16, 15, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 1, 8, 14], "texture": "#0"},
            				"east": {"uv": [6, 1, 9, 14], "texture": "#0"},
            				"south": {"uv": [7, 1, 8, 14], "texture": "#0"},
            				"west": {"uv": [6, 1, 9, 14], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14, 0, 7],
            			"to": [15, 15, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 0, 7],
            			"to": [2, 15, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 14, 7],
            			"to": [14, 15, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
            			"faces": {
            				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 7.5],
            			"to": [14, 14, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
            			"faces": {
            				"north": {"uv": [16, 0, 0, 15], "texture": "#1"},
            				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
            				"south": {"uv": [16, 0, 0, 15], "texture": "#1"},
            				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
            				"up": {"uv": [14, 6, 2, 7], "texture": "#1"},
            				"down": {"uv": [14, 6, 2, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13.75, 0, 8.5],
            			"to": [14.75, 4, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 0, 8.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2.5, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2.5, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.75, 3.75, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.75, 3.75, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String VERTICAL_WINDOW_UP_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 15, 6.5],
            			"to": [16, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 6.5],
            			"to": [1, 15, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 1, 8, 16], "texture": "#0"},
            				"east": {"uv": [6, 1, 9, 16], "texture": "#0"},
            				"south": {"uv": [7, 1, 8, 16], "texture": "#0"},
            				"west": {"uv": [6, 1, 9, 16], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 0, 6.5],
            			"to": [16, 15, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 1, 8, 16], "texture": "#0"},
            				"east": {"uv": [6, 1, 9, 16], "texture": "#0"},
            				"south": {"uv": [7, 1, 8, 16], "texture": "#0"},
            				"west": {"uv": [6, 1, 9, 16], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 0, 7.5],
            			"to": [5.5, 15, 8.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"east": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"west": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 0, 20.5],
            			"to": [5.5, 15, 21.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"east": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"west": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 14, 8.5],
            			"to": [5.5, 15, 20.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [4, 0, 8.5],
            			"to": [5, 14, 20.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
            				"east": {"uv": [16, 0, 0, 15], "texture": "#1"},
            				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
            				"west": {"uv": [16, 0, 0, 15], "texture": "#1"},
            				"up": {"uv": [14, 6, 2, 7], "rotation": 270, "texture": "#1"},
            				"down": {"uv": [14, 6, 2, 7], "rotation": 90, "texture": "#1"}
            			}
            		},
            		{
            			"from": [3, 0, 20.25],
            			"to": [4, 4, 21.25],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 3, 14.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
            			}
            		}
            	],
            	"groups": [
            		0,
            		1,
            		2,
            		{
            			"name": "door",
            			"origin": [8, 8, 7.5],
            			"color": 0,
            			"children": [3, 4, 5, 6, 7]
            		}
            	]
            }
            """;

    public static String VERTICAL_WINDOW_DOWN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 6.5],
            			"to": [16, 1, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 1, 6.5],
            			"to": [1, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
            				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
            				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
            				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 1, 6.5],
            			"to": [16, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
            				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
            				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
            				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14, 1, 7],
            			"to": [15, 16, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 1, 7],
            			"to": [2, 16, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 1, 7],
            			"to": [14, 2, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
            			"faces": {
            				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 2, 7.5],
            			"to": [14, 16, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
            			"faces": {
            				"north": {"uv": [16, 1, 0, 16], "texture": "#1"},
            				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
            				"south": {"uv": [16, 1, 0, 16], "texture": "#1"},
            				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
            				"up": {"uv": [14, 7, 2, 8], "texture": "#1"},
            				"down": {"uv": [14, 7, 2, 8], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13.75, 12, 8.5],
            			"to": [14.75, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 12, 8.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2.5, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2.5, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.75, 3.75, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.75, 3.75, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String VERTICAL_WINDOW_DOWN_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 7.5],
             			"to": [5.5, 16, 8.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 20.5],
             			"to": [5.5, 16, 21.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 8.5],
             			"to": [5.5, 2, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [4, 2, 8.5],
             			"to": [5, 16, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [3, 12, 20.25],
             			"to": [4, 16, 21.25],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 14, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [3, 4, 5, 6, 7]
             		}
             	]
            }
            """;
    
    public static String FOURPANE_WINDOW = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 2, 7],
             			"to": [8.5, 14, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"east": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"south": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"west": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"up": {"uv": [0, 1, 1, 3], "texture": "#0"},
             				"down": {"uv": [0, 1, 1, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.0001],
             			"to": [14, 8.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 8.5, 7.5],
             			"to": [7.5, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [0, 0, 12, 1], "texture": "#1"},
             				"down": {"uv": [0, 0, 12, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 8.5, 7.5],
             			"to": [14, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [0, 0, 12, 1], "texture": "#1"},
             				"down": {"uv": [0, 0, 12, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 2, 7.5],
             			"to": [14, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [0, 0, 12, 1], "texture": "#1"},
             				"down": {"uv": [0, 0, 12, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 2, 7.5],
             			"to": [7.5, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [0, 0, 12, 1], "texture": "#1"},
             				"down": {"uv": [0, 0, 12, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1.25, 6, 8.5],
             			"to": [2.25, 10, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 6, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
             				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_WINDOW_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 7.5],
             			"to": [12.5, 15, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 20.5],
             			"to": [12.5, 15, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13, 2, 14.5],
             			"to": [15, 14, 15.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [14.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"east": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"south": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"west": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"up": {"uv": [1, 3, 0, 1], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 3, 0, 1], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 8.5],
             			"to": [12.5, 2, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 14, 8.5],
             			"to": [12.5, 15, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 7.5, 8.5],
             			"to": [12.5, 8.5, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 1.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [11, 8.5, 8.5],
             			"to": [12, 14, 14],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"up": {"uv": [12, 1, 0, 0], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 1, 0, 0], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [11, 2, 8.5],
             			"to": [12, 7.5, 14],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 1.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"up": {"uv": [12, 1, 0, 0], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 1, 0, 0], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 8.5, 14.5],
             			"to": [9.5, 14, 20],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [9.5, 8, 20.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"up": {"uv": [12, 1, 0, 0], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 1, 0, 0], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 2, 14.5],
             			"to": [9.5, 7.5, 20],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [9.5, 1.5, 20.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"up": {"uv": [12, 1, 0, 0], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 1, 0, 0], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [12, 6, 20.25],
             			"to": [13, 10, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		3,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
             		}
             	]
            }
            """;

    public static String FOURPANE_WINDOW_LEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.75],
             			"to": [16, 15, 9.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 2, 7],
             			"to": [8.5, 14, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 1, 0, 13], "texture": "#0"},
             				"east": {"uv": [2, 1, 0, 13], "texture": "#0"},
             				"south": {"uv": [1, 1, 0, 13], "texture": "#0"},
             				"west": {"uv": [2, 1, 0, 13], "texture": "#0"},
             				"up": {"uv": [1, 1, 0, 3], "texture": "#0"},
             				"down": {"uv": [1, 1, 0, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.0001],
             			"to": [14, 8.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 8.5, 7.5],
             			"to": [7.5, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 8.5, 7.5],
             			"to": [14, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 2, 7.5],
             			"to": [14, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 2, 7.5],
             			"to": [7.5, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [13.75, 6, 8.5],
             			"to": [14.75, 10, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 6, 8.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
             			}
             		}
             	]
            }
            """;

    public static String FOURPANE_WINDOW_LEFT_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.75],
             			"to": [16, 15, 9.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 8.5, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 8.5, 15], "texture": "#0"},
             				"up": {"uv": [7, 8, 8, 10.5], "texture": "#0"},
             				"down": {"uv": [7, 8, 8, 10.5], "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 7.5],
             			"to": [5.5, 15, 8.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 20.5],
             			"to": [5.5, 15, 21.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 2, 14.5],
             			"to": [3, 14, 15.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [1.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [2, 1, 0, 13], "texture": "#0"},
             				"east": {"uv": [1, 1, 0, 13], "texture": "#0"},
             				"south": {"uv": [2, 1, 0, 13], "texture": "#0"},
             				"west": {"uv": [1, 1, 0, 13], "texture": "#0"},
             				"up": {"uv": [1, 1, 0, 3], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 1, 0, 3], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 8.5],
             			"to": [5.5, 2, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 14, 8.5],
             			"to": [5.5, 15, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 7.5, 8.5],
             			"to": [5.5, 8.5, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 1.5, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [4, 8.5, 8.5],
             			"to": [5, 14, 14],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [4, 2, 8.5],
             			"to": [5, 7.5, 14],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 1.5, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [6.5, 8.5, 14.5],
             			"to": [7.5, 14, 20],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [6.5, 8, 20.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [6.5, 2, 14.5],
             			"to": [7.5, 7.5, 20],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [6.5, 1.5, 20.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [3, 6, 20.25],
             			"to": [4, 10, 21.25],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		3,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
             		}
             	]
            }
            """;

    public static String FOURPANE_WINDOW_RIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.75],
             			"to": [1, 15, 9.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 2, 7],
             			"to": [8.5, 14, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"east": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"south": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"west": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"up": {"uv": [0, 1, 1, 3], "texture": "#0"},
             				"down": {"uv": [0, 1, 1, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.0001],
             			"to": [14, 8.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [8.5, 8.5, 7.5],
             			"to": [14, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [0, 0, 12, 1], "texture": "#1"},
             				"down": {"uv": [0, 0, 12, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 8.5, 7.5],
             			"to": [7.5, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [0, 0, 12, 1], "texture": "#1"},
             				"down": {"uv": [0, 0, 12, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 2, 7.5],
             			"to": [7.5, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [0, 0, 12, 1], "texture": "#1"},
             				"down": {"uv": [0, 0, 12, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 2, 7.5],
             			"to": [14, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [0, 0, 12, 1], "texture": "#1"},
             				"down": {"uv": [0, 0, 12, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1.25, 6, 8.5],
             			"to": [2.25, 10, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 6, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
             				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
             			}
             		}
             	]
            }
            """;

    public static String FOURPANE_WINDOW_RIGHT_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.75],
             			"to": [1, 15, 9.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 8.5, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 8.5, 15], "texture": "#0"},
             				"up": {"uv": [7, 8, 8, 10.5], "texture": "#0"},
             				"down": {"uv": [7, 8, 8, 10.5], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 7.5],
             			"to": [12.5, 15, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 20.5],
             			"to": [12.5, 15, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13, 2, 14.5],
             			"to": [15, 14, 15.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [14.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"east": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"south": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"west": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"up": {"uv": [1, 3, 0, 1], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 3, 0, 1], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 8.5],
             			"to": [12.5, 2, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 14, 8.5],
             			"to": [12.5, 15, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 7.5, 8.5],
             			"to": [12.5, 8.5, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 1.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [11, 8.5, 15],
             			"to": [12, 14, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"up": {"uv": [12, 1, 0, 0], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 1, 0, 0], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [11, 2, 15],
             			"to": [12, 7.5, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 1.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"up": {"uv": [12, 1, 0, 0], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 1, 0, 0], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [13.5, 8.5, 9],
             			"to": [14.5, 14, 14.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [14.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"up": {"uv": [12, 1, 0, 0], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 1, 0, 0], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [13.5, 2, 9],
             			"to": [14.5, 7.5, 14.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [14.5, 1.5, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"up": {"uv": [12, 1, 0, 0], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 1, 0, 0], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [12, 6, 20.25],
             			"to": [13, 10, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		3,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
             		}
             	]
            }
            """;

    public static String FOURPANE_WINDOW_CENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.75],
             			"to": [1, 15, 9.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.75],
             			"to": [16, 15, 9.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 2, 7],
             			"to": [8.5, 14, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.0001],
             			"to": [14, 8.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 8.5, 7.5],
             			"to": [7.5, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 8.5, 7.5],
             			"to": [14, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 2, 7.5],
             			"to": [14, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 2, 7.5],
             			"to": [7.5, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
             			}
             		}
             	]
            }
            """;

    public static String FOURPANE_WINDOW_CENTER_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.75],
             			"to": [1, 15, 9.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.75],
             			"to": [16, 15, 9.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 2, 7],
             			"to": [8.5, 14, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.0001],
             			"to": [14, 8.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 8.5, 7.5],
             			"to": [7.5, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 8.5, 7.5],
             			"to": [14, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 2, 7.5],
             			"to": [14, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 2, 7.5],
             			"to": [7.5, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
             			}
             		}
             	]
            }
            """;

    public static String FOURPANE_VERTICAL_WINDOW = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 2, 7],
             			"to": [8.5, 14, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"east": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"south": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"west": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"up": {"uv": [0, 1, 1, 3], "texture": "#0"},
             				"down": {"uv": [0, 1, 1, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.0001],
             			"to": [14, 8.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 8.5, 7.5],
             			"to": [7.5, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [0, 0, 12, 1], "texture": "#1"},
             				"down": {"uv": [0, 0, 12, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 8.5, 7.5],
             			"to": [14, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [0, 0, 12, 1], "texture": "#1"},
             				"down": {"uv": [0, 0, 12, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 2, 7.5],
             			"to": [14, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [0, 0, 12, 1], "texture": "#1"},
             				"down": {"uv": [0, 0, 12, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 2, 7.5],
             			"to": [7.5, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [0, 0, 12, 1], "texture": "#1"},
             				"down": {"uv": [0, 0, 12, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1.25, 6, 8.5],
             			"to": [2.25, 10, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 6, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
             				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_VERTICAL_WINDOW_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 7.5],
             			"to": [12.5, 15, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 20.5],
             			"to": [12.5, 15, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13, 2, 14.5],
             			"to": [15, 14, 15.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [14.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"east": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"south": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"west": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"up": {"uv": [1, 3, 0, 1], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 3, 0, 1], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 8.5],
             			"to": [12.5, 2, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 14, 8.5],
             			"to": [12.5, 15, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 7.5, 8.5],
             			"to": [12.5, 8.5, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 1.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [11, 8.5, 8.5],
             			"to": [12, 14, 14],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"up": {"uv": [12, 1, 0, 0], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 1, 0, 0], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [11, 2, 8.5],
             			"to": [12, 7.5, 14],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 1.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"up": {"uv": [12, 1, 0, 0], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 1, 0, 0], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 8.5, 14.5],
             			"to": [9.5, 14, 20],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [9.5, 8, 20.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"up": {"uv": [12, 1, 0, 0], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 1, 0, 0], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 2, 14.5],
             			"to": [9.5, 7.5, 20],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [9.5, 1.5, 20.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"up": {"uv": [12, 1, 0, 0], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 1, 0, 0], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [12, 6, 20.25],
             			"to": [13, 10, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		3,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
             		}
             	]
            }
            """;

    public static String FOURPANE_VERTICAL_WINDOW_UP = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 14], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 14], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 14], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 14], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 14], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 14], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 14], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 14], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 0, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 0, 7],
             			"to": [8.5, 14, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 0, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 6.5, 7.0001],
             			"to": [14, 7.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.5],
             			"to": [7.5, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [2, 6, 14, 7], "texture": "#1"},
             				"down": {"uv": [2, 6, 14, 7], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 0, 7.5],
             			"to": [7.5, 6.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [2, 6, 14, 7], "texture": "#1"},
             				"down": {"uv": [2, 6, 14, 7], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 0, 7.5],
             			"to": [14, 6.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [2, 6, 14, 7], "texture": "#1"},
             				"down": {"uv": [2, 6, 14, 7], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 7.5, 7.5],
             			"to": [14, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [2, 6, 14, 7], "texture": "#1"},
             				"down": {"uv": [2, 6, 14, 7], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1.25, 0, 8.5],
             			"to": [2.25, 4, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 0, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
             				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_VERTICAL_WINDOW_UP_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 0, 7.5],
             			"to": [12.5, 15, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 0, 20.5],
             			"to": [12.5, 15, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13, 0, 14.5],
             			"to": [15, 14, 15.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [14.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 14, 8.5],
             			"to": [12.5, 15, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 6.5, 8.5],
             			"to": [12.5, 7.5, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 0.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [11, 7.5, 15],
             			"to": [12, 14, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 6], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 6], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [11, 0, 15],
             			"to": [12, 6.5, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 0.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 6], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 6], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [13.5, 7.5, 9],
             			"to": [14.5, 14, 14.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [14.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 6], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 6], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [13.5, 0, 9],
             			"to": [14.5, 6.5, 14.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [14.5, 0.5, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 6], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 6], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [12, 0, 20.25],
             			"to": [13, 4, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 3, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
             		}
             	]
            }
            """;

    public static String FOURPANE_VERTICAL_WINDOW_DOWN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 2, 7],
             			"to": [8.5, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 8.5, 7.0001],
             			"to": [14, 9.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 9, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 9.5, 7.5],
             			"to": [7.5, 16, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [2, 7, 14, 8], "texture": "#1"},
             				"down": {"uv": [2, 7, 14, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 9.5, 7.5],
             			"to": [14, 16, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [2, 7, 14, 8], "texture": "#1"},
             				"down": {"uv": [2, 7, 14, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 2, 7.5],
             			"to": [14, 8.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [2, 7, 14, 8], "texture": "#1"},
             				"down": {"uv": [2, 7, 14, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 2, 7.5],
             			"to": [7.5, 8.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [2, 7, 14, 8], "texture": "#1"},
             				"down": {"uv": [2, 7, 14, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1.25, 12, 8.5],
             			"to": [2.25, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 12, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
             				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_VERTICAL_WINDOW_DOWN_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 7.5],
             			"to": [12.5, 16, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 20.5],
             			"to": [12.5, 16, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13, 2, 14.5],
             			"to": [15, 16, 15.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [14.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 8.5],
             			"to": [12.5, 2, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 8.5, 8.5],
             			"to": [12.5, 9.5, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 15.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [11, 9.5, 8.5],
             			"to": [12, 16, 14],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"up": {"uv": [14, 8, 2, 7], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 8, 2, 7], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [11, 2, 8.5],
             			"to": [12, 8.5, 14],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 0.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"up": {"uv": [14, 8, 2, 7], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 8, 2, 7], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 9.5, 14.5],
             			"to": [9.5, 16, 20],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [9.5, 8, 20.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"up": {"uv": [14, 8, 2, 7], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 8, 2, 7], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 2, 14.5],
             			"to": [9.5, 8.5, 20],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [9.5, 0, 20.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 16], "texture": "#1"},
             				"up": {"uv": [14, 8, 2, 7], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 8, 2, 7], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [12, 12, 20.25],
             			"to": [13, 16, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 14, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
             		}
             	]
            }
            """;

    public static String FOURPANE_VERTICAL_WINDOW_CENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 0, 7],
             			"to": [2, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 0, 7],
             			"to": [8.5, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 0, 7],
             			"to": [15, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [8.5, 8.5, 7.5],
             			"to": [14, 16, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [2, 7, 14, 8], "texture": "#1"},
             				"down": {"uv": [2, 7, 14, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 8.5, 7.5],
             			"to": [7.5, 16, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [2, 7, 14, 8], "texture": "#1"},
             				"down": {"uv": [2, 7, 14, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 0, 7.5],
             			"to": [7.5, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, -0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [2, 7, 14, 8], "texture": "#1"},
             				"down": {"uv": [2, 7, 14, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 0, 7.5],
             			"to": [14, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, -0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"east": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"south": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"west": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"up": {"uv": [2, 7, 14, 8], "texture": "#1"},
             				"down": {"uv": [2, 7, 14, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1.25, 0, 8.5],
             			"to": [2.25, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 12, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
             				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.001],
             			"to": [14, 8.5, 9.001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [2, 7, 14, 8], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [2, 7, 14, 8], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [2, 7, 14, 9], "texture": "#0"},
             				"down": {"uv": [2, 7, 14, 9], "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_VERTICAL_WINDOW_CENTER_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 0, 7.5],
             			"to": [12.5, 16, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 0, 20.5],
             			"to": [12.5, 16, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13, 0, 14.5],
             			"to": [15, 16, 15.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [14.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [11, 8.5, 8.5],
             			"to": [12, 16, 14],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"up": {"uv": [14, 8, 2, 7], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 8, 2, 7], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 8.5, 14.5],
             			"to": [9.5, 16, 20],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [9.5, 8, 20.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 1, 16, 16], "texture": "#1"},
             				"up": {"uv": [14, 8, 2, 7], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 8, 2, 7], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 0, 14.5],
             			"to": [9.5, 7.5, 20],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [9.5, -0.5, 20.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"up": {"uv": [14, 8, 2, 7], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 8, 2, 7], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [11, 0, 8.5],
             			"to": [12, 7.5, 14],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, -0.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"east": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 12], "texture": "#1"},
             				"west": {"uv": [0, 0, 16, 15], "texture": "#1"},
             				"up": {"uv": [14, 8, 2, 7], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 8, 2, 7], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [12, 0, 20.25],
             			"to": [13, 16, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 15, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		},
             		{
             			"from": [10.5, 7.5, 8.5],
             			"to": [12.5, 8.5, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 1.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [2, 6, 14, 7], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [2, 6, 14, 7], "texture": "#0"},
             				"up": {"uv": [14, 8, 2, 6], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [14, 8, 2, 6], "rotation": 90, "texture": "#0"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [2, 3, 4, 5, 6, 7, 8, 9, 10]
             		}
             	]
            }
            """;

    public static String FOURPANE_VERTICAL_WINDOW_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 2, 7],
             			"to": [8.5, 14, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 2, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 2, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 2, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 2, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.0001],
             			"to": [14, 8.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8.1]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [8.5, 8.5, 7.5],
             			"to": [14, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 8.5, 7.5],
             			"to": [7.5, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 2, 7.5],
             			"to": [7.5, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 2, 7.5],
             			"to": [14, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "texture": "#1"}
             			}
             		},
             		{
             			"from": [13.75, 6, 8.5],
             			"to": [14.75, 10, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 6, 8.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_VERTICAL_WINDOW_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 7.5],
             			"to": [5.5, 15, 8.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 20.5],
             			"to": [5.5, 15, 21.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 2, 14.5],
             			"to": [3, 14, 15.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [1.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [2, 2, 0, 14], "texture": "#0"},
             				"east": {"uv": [1, 2, 0, 14], "texture": "#0"},
             				"south": {"uv": [2, 2, 0, 14], "texture": "#0"},
             				"west": {"uv": [1, 2, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 8.5],
             			"to": [5.5, 2, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 7.5, 8.5],
             			"to": [5.5, 8.5, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 14.5, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 14, 8.5],
             			"to": [5.5, 15, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [4, 8.5, 8.5],
             			"to": [5, 14, 14],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [4, 2, 8.5],
             			"to": [5, 7.5, 14],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 1.5, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [6.5, 8.5, 14.5],
             			"to": [7.5, 14, 20],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [6.5, 8, 20.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [6.5, 2, 14.5],
             			"to": [7.5, 7.5, 20],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [6.5, 1.5, 20.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"up": {"uv": [12, 0, 0, 1], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [12, 0, 0, 1], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [3, 6, 20.25],
             			"to": [4, 10, 21.25],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		3,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
             		}
             	]
            }
            """;

    public static String FOURPANE_VERTICAL_WINDOW_UP_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 14], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 14], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 14], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 14], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 14], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 14], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 14], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 14], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 0, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 0, 7],
             			"to": [8.5, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 0, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 6.5, 7],
             			"to": [14, 7.5, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [8.5, 7.5, 7.5],
             			"to": [14, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [14, 6, 2, 7], "texture": "#1"},
             				"down": {"uv": [14, 6, 2, 7], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.5],
             			"to": [7.5, 14, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [14, 6, 2, 7], "texture": "#1"},
             				"down": {"uv": [14, 6, 2, 7], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 0, 7.5],
             			"to": [7.5, 6.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 15], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 15], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [14, 6, 2, 7], "texture": "#1"},
             				"down": {"uv": [14, 6, 2, 7], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 0, 7.5],
             			"to": [14, 6.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 15], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 15], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [14, 6, 2, 7], "texture": "#1"},
             				"down": {"uv": [14, 6, 2, 7], "texture": "#1"}
             			}
             		},
             		{
             			"from": [13.75, 0, 8.5],
             			"to": [14.75, 4, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 0, 8.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_VERTICAL_WINDOW_UP_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 0, 7.5],
             			"to": [5.5, 15, 8.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 0, 20.5],
             			"to": [5.5, 15, 21.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 0, 14.5],
             			"to": [3, 14, 15.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [1.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [2, 1, 0, 15], "texture": "#0"},
             				"east": {"uv": [1, 1, 0, 15], "texture": "#0"},
             				"south": {"uv": [2, 1, 0, 15], "texture": "#0"},
             				"west": {"uv": [1, 1, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 1, 0, 3], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 1, 0, 3], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 14, 8.5],
             			"to": [5.5, 15, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 6.5, 8.5],
             			"to": [5.5, 7.5, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 0.5, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [4, 7.5, 8.5],
             			"to": [5, 14, 14],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"up": {"uv": [14, 6, 2, 7], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 6, 2, 7], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [4, 0, 8.5],
             			"to": [5, 6.5, 14],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 0.5, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 0, 0, 15], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 0, 0, 15], "texture": "#1"},
             				"up": {"uv": [14, 6, 2, 7], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 6, 2, 7], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [6.5, 7.5, 14.5],
             			"to": [7.5, 14, 20],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [6.5, 8, 20.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"up": {"uv": [14, 6, 2, 7], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 6, 2, 7], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [6.5, 0, 14.5],
             			"to": [7.5, 6.5, 20],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [6.5, 0.5, 20.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 0, 0, 15], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 0, 0, 15], "texture": "#1"},
             				"up": {"uv": [14, 6, 2, 7], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 6, 2, 7], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [3, 0, 20.25],
             			"to": [4, 4, 21.25],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 3, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
             		}
             	]
            }
            """;

    public static String FOURPANE_VERTICAL_WINDOW_DOWN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 1, 7],
             			"to": [8.5, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 8.5, 7.0001],
             			"to": [14, 9.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 9, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 9.5, 7.5],
             			"to": [7.5, 16, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 9.5, 7.5],
             			"to": [14, 16, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 2, 7.5],
             			"to": [14, 8.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 2, 7.5],
             			"to": [7.5, 8.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [13.75, 12, 8.5],
             			"to": [14.75, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 12, 8.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_VERTICAL_WINDOW_DOWN_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 7.5],
             			"to": [5.5, 16, 8.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 20.5],
             			"to": [5.5, 16, 21.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 2, 14.5],
             			"to": [3, 16, 15.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [1.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 8.5],
             			"to": [5.5, 2, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 8.5, 8.5],
             			"to": [5.5, 9.5, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 15.5, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [4, 9.5, 8.5],
             			"to": [5, 16, 14],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [4, 2, 8.5],
             			"to": [5, 8.5, 14],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 0.5, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [6.5, 9.5, 14.5],
             			"to": [7.5, 16, 20],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [6.5, 8, 20.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [6.5, 2, 14.5],
             			"to": [7.5, 8.5, 20],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [6.5, 0.5, 20.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 0, 0, 16], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [3, 12, 20.25],
             			"to": [4, 16, 21.25],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 14, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
             		}
             	]
            }
            """;

    public static String FOURPANE_VERTICAL_WINDOW_CENTER_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 0, 7],
             			"to": [15, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 0, 7],
             			"to": [2, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 0, 7],
             			"to": [8.5, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [8.5, 8.5, 7.5],
             			"to": [14, 16, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 8.5, 7.5],
             			"to": [7.5, 16, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 0, 7.5],
             			"to": [7.5, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, -0.5, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 15], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 15], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [8.5, 0, 7.5],
             			"to": [14, 7.5, 8.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, -0.5, 8]},
             			"faces": {
             				"north": {"uv": [16, 0, 0, 15], "texture": "#1"},
             				"east": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"south": {"uv": [16, 0, 0, 15], "texture": "#1"},
             				"west": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "texture": "#1"}
             			}
             		},
             		{
             			"from": [13.75, 0, 8.5],
             			"to": [14.75, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 12, 8.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 16], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 16], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 16], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 16], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.001],
             			"to": [14, 8.5, 9.001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8.1]},
             			"faces": {
             				"north": {"uv": [14, 5, 2, 6], "texture": "#0"},
             				"east": {"uv": [4, 5, 2, 6], "texture": "#0"},
             				"south": {"uv": [14, 5, 2, 6], "texture": "#0"},
             				"west": {"uv": [4, 5, 2, 6], "texture": "#0"},
             				"up": {"uv": [14, 5, 2, 7], "texture": "#0"},
             				"down": {"uv": [14, 5, 2, 7], "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_VERTICAL_WINDOW_CENTER_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "GLASS_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 0, 7.5],
             			"to": [5.5, 16, 8.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 0, 20.5],
             			"to": [5.5, 16, 21.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 0, 14.5],
             			"to": [3, 16, 15.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [1.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [4, 8.5, 8.5],
             			"to": [5, 16, 14],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [4, 0, 8.5],
             			"to": [5, 7.5, 14],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, -0.5, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 0, 0, 15], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 0, 0, 15], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [6.5, 8.5, 14.5],
             			"to": [7.5, 16, 20],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [6.5, 8, 20.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 1, 0, 16], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [6.5, 0, 14.5],
             			"to": [7.5, 7.5, 20],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [6.5, -0.5, 20.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"east": {"uv": [16, 0, 0, 15], "texture": "#1"},
             				"south": {"uv": [1, 0, 0, 12], "texture": "#1"},
             				"west": {"uv": [16, 0, 0, 15], "texture": "#1"},
             				"up": {"uv": [14, 7, 2, 8], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [14, 7, 2, 8], "rotation": 90, "texture": "#1"}
             			}
             		},
             		{
             			"from": [3, 0, 20.25],
             			"to": [4, 16, 21.25],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 15, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 16], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 16], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 16], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 16], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
             			}
             		},
             		{
             			"from": [3.5, 7.5, 8.5],
             			"to": [5.5, 8.5, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 14.5, 14.5]},
             			"faces": {
             				"north": {"uv": [4, 5, 2, 6], "texture": "#0"},
             				"east": {"uv": [14, 6, 2, 7], "texture": "#0"},
             				"south": {"uv": [4, 5, 2, 6], "texture": "#0"},
             				"west": {"uv": [14, 6, 2, 7], "texture": "#0"},
             				"up": {"uv": [14, 5, 2, 7], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [14, 5, 2, 7], "rotation": 90, "texture": "#0"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [2, 3, 4, 5, 6, 7, 8, 9, 10]
             		}
             	]
            }
            """;


    public static String STONECUTTING_RECIPE = """
            {
              "type": "minecraft:stonecutting",
              "ingredient": {
                "item": "INGREDIENT_NAME"
              },
              "result": {
                "count": COUNT,
                "id": "aestheticwindows:OUTPUT_NAME"
              }
            }
            """;

    public static String SHAPELESS_RECIPE = """
            {
              "type": "minecraft:crafting_shapeless",
              "ingredient": [
                {
                    "item": "INGREDIENT_NAME"
                },
                {
                    "item": "INGREDIENT2_NAME"
                }
              ],
              "result": {
                "count": 1,
                "id": "aestheticwindows:OUTPUT_NAME"
              }
            }
            """;

    public static String EMPTY_WINDOW = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.5],
              			"to": [1, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.5],
              			"to": [16, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 1, 7],
              			"to": [2, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [14, 1, 7],
              			"to": [15, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 1, 7],
              			"to": [14, 2, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 14, 7],
              			"to": [14, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1.25, 6, 8.5],
              			"to": [2.25, 10, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 6, 8.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
              				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
              			}
              		}
              	],
              	"display": {
              		"thirdperson_righthand": {
              			"translation": [2.5, 2, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"thirdperson_lefthand": {
              			"translation": [2.5, 2, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_righthand": {
              			"translation": [0.75, 3.75, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_lefthand": {
              			"translation": [0.75, 3.75, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"ground": {
              			"translation": [0, 2, 0],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"gui": {
              			"rotation": [20, -45, 0],
              			"scale": [0.6, 0.6, 0.6]
              		},
              		"fixed": {
              			"rotation": [180, 0, 180],
              			"translation": [0, 0, 0.5],
              			"scale": [0.5, 0.5, 0.5]
              		}
              	}
            }
            """;

    public static String EMPTY_WINDOW_CENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.75],
              			"to": [1, 15, 9.25],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.75],
              			"to": [16, 15, 9.25],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [14, 1, 7],
              			"to": [15, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 1, 7],
              			"to": [2, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 1, 7],
              			"to": [14, 2, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
              			"faces": {
              				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 14, 7],
              			"to": [14, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
              			"faces": {
              				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
              			}
              		}
              	]
            }
            """;

    public static String EMPTY_WINDOW_LEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.5],
              			"to": [1, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.75],
              			"to": [16, 15, 9.25],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [14, 1, 7],
              			"to": [15, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 1, 7],
              			"to": [2, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 1, 7],
              			"to": [14, 2, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
              			"faces": {
              				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 14, 7],
              			"to": [14, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
              			"faces": {
              				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [13.75, 6, 8.5],
              			"to": [14.75, 10, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 6, 8.5]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
              				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
              				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
              				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
              				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
              				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
              			}
              		}
              	]
            }
            """;

    public static String EMPTY_WINDOW_RIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.75],
              			"to": [1, 15, 9.25],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.5],
              			"to": [16, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 1, 7],
              			"to": [2, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [14, 1, 7],
              			"to": [15, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 1, 7],
              			"to": [14, 2, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 14, 7],
              			"to": [14, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1.25, 6, 8.5],
              			"to": [2.25, 10, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 6, 8.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
              				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
              			}
              		}
              	]
            }
            """;

    public static String EMPTY_WINDOW_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.5],
              			"to": [1, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.5],
              			"to": [16, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 7.5],
              			"to": [12.5, 15, 8.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 20.5],
              			"to": [12.5, 15, 21.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 8.5],
              			"to": [12.5, 2, 20.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 14, 8.5],
              			"to": [12.5, 15, 20.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [12, 6, 20.25],
              			"to": [13, 10, 21.25],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
              				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
              			}
              		}
              	],
              	"groups": [
              		0,
              		1,
              		2,
              		3,
              		{
              			"name": "door",
              			"origin": [8, 8, 7.5],
              			"color": 0,
              			"children": [4, 5, 6, 7, 8, 9]
              		}
              	]
            }
            """;

    public static String EMPTY_WINDOW_OPEN_CENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.75],
              			"to": [1, 15, 9.25],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.75],
              			"to": [16, 15, 9.25],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [14, 1, 7],
              			"to": [15, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 1, 7],
              			"to": [2, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 1, 7],
              			"to": [14, 2, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
              			"faces": {
              				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 14, 7],
              			"to": [14, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
              			"faces": {
              				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
              				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
              			}
              		}
              	]
            }
            """;

    public static String EMPTY_WINDOW_OPEN_LEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.5],
              			"to": [1, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.75],
              			"to": [16, 15, 9.25],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 8.5, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 8.5, 15], "texture": "#0"},
              				"up": {"uv": [7, 8, 8, 10.5], "texture": "#0"},
              				"down": {"uv": [7, 8, 8, 10.5], "texture": "#0"}
              			}
              		},
              		{
              			"from": [3.5, 1, 7.5],
              			"to": [5.5, 15, 8.5],
              			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [3.5, 1, 20.5],
              			"to": [5.5, 15, 21.5],
              			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
              				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
              				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [3.5, 1, 8.5],
              			"to": [5.5, 2, 20.5],
              			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [3.5, 14, 8.5],
              			"to": [5.5, 15, 20.5],
              			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
              				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
              				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [3, 6, 20.25],
              			"to": [4, 10, 21.25],
              			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
              				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
              				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
              				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
              				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
              				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
              			}
              		}
              	],
              	"groups": [
              		0,
              		1,
              		2,
              		3,
              		{
              			"name": "door",
              			"origin": [8, 8, 7.5],
              			"color": 0,
              			"children": [4, 5, 6, 7, 8, 9]
              		}
              	]
            }
            """;

    public static String EMPTY_WINDOW_OPEN_RIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.75],
              			"to": [1, 15, 9.25],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 8.5, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 8.5, 15], "texture": "#0"},
              				"up": {"uv": [7, 8, 8, 10.5], "texture": "#0"},
              				"down": {"uv": [7, 8, 8, 10.5], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.5],
              			"to": [16, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 7.5],
              			"to": [12.5, 15, 8.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 20.5],
              			"to": [12.5, 15, 21.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 8.5],
              			"to": [12.5, 2, 20.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 14, 8.5],
              			"to": [12.5, 15, 20.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [12, 6, 20.25],
              			"to": [13, 10, 21.25],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
              				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
              			}
              		}
              	],
              	"groups": [
              		0,
              		1,
              		2,
              		3,
              		{
              			"name": "door",
              			"origin": [8, 8, 7.5],
              			"color": 0,
              			"children": [4, 5, 6, 7, 8, 9]
              		}
              	]
            }
            """;

    public static String VERTICAL_EMPTY_WINDOW = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.5],
              			"to": [1, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.5],
              			"to": [16, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 1, 7],
              			"to": [2, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [14, 1, 7],
              			"to": [15, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 1, 7],
              			"to": [14, 2, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 14, 7],
              			"to": [14, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1.25, 6, 8.5],
              			"to": [2.25, 10, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 6, 8.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
              				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
              			}
              		}
              	],
              	"display": {
              		"thirdperson_righthand": {
              			"translation": [2.5, 2, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"thirdperson_lefthand": {
              			"translation": [2.5, 2, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_righthand": {
              			"translation": [0.75, 3.75, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_lefthand": {
              			"translation": [0.75, 3.75, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"ground": {
              			"translation": [0, 2, 0],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"gui": {
              			"rotation": [20, -45, 0],
              			"scale": [0.6, 0.6, 0.6]
              		},
              		"fixed": {
              			"rotation": [180, 0, 180],
              			"translation": [0, 0, 0.5],
              			"scale": [0.5, 0.5, 0.5]
              		}
              	}
            }
            """;

    public static String VERTICAL_EMPTY_WINDOW_CENTER = """
            {
             	"credit": "Made with Blockbench",
             	"textures": {
             		"0": "BASE_NAME",
             		
             		"2": "HANDLE_NAME",
             		"particle": "BASE_NAME"
             	},
             	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [1, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
              				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
              				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
              				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 0, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
              				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
              				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
              				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 0, 7],
              			"to": [2, 16, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 16], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 16], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 16], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 16], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [14, 0, 7],
              			"to": [15, 16, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 16], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 16], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 16], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 16], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1.25, 0, 8.5],
              			"to": [2.25, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 12, 8.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 16], "texture": "#2"},
              				"east": {"uv": [0, 0, 1, 16], "texture": "#2"},
              				"south": {"uv": [0, 0, 1, 16], "texture": "#2"},
              				"west": {"uv": [0, 0, 1, 16], "texture": "#2"},
              				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
              				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
              			}
              		}
              	],
              	"display": {
              		"thirdperson_righthand": {
              			"translation": [2.5, 2, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"thirdperson_lefthand": {
              			"translation": [2.5, 2, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_righthand": {
              			"translation": [0.75, 3.75, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_lefthand": {
              			"translation": [0.75, 3.75, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"ground": {
              			"translation": [0, 2, 0],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"gui": {
              			"rotation": [20, -45, 0],
              			"scale": [0.6, 0.6, 0.6]
              		},
              		"fixed": {
              			"rotation": [180, 0, 180],
              			"translation": [0, 0, 0.5],
              			"scale": [0.5, 0.5, 0.5]
              		}
              	}
            }
            """;

    public static String VERTICAL_EMPTY_WINDOW_UP = """
            {
             	"credit": "Made with Blockbench",
             	"textures": {
             		"0": "BASE_NAME",
             		
             		"2": "HANDLE_NAME",
             		"particle": "BASE_NAME"
             	},
             	"elements": [
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 0, 6.5],
              			"to": [1, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 14], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 14], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 14], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 14], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 0, 6.5],
              			"to": [16, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 14], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 14], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 14], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 14], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 0, 7],
              			"to": [2, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 15], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 15], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [14, 0, 7],
              			"to": [15, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 15], "texture": "#0"},
              				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 15], "texture": "#0"},
              				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 14, 7],
              			"to": [14, 15, 9],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
              				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1.25, 0, 8.5],
              			"to": [2.25, 4, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 0, 8.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
              				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
              			}
              		}
              	],
              	"display": {
              		"thirdperson_righthand": {
              			"translation": [2.5, 2, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"thirdperson_lefthand": {
              			"translation": [2.5, 2, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_righthand": {
              			"translation": [0.75, 3.75, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_lefthand": {
              			"translation": [0.75, 3.75, 1.5],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"ground": {
              			"translation": [0, 2, 0],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"gui": {
              			"rotation": [20, -45, 0],
              			"scale": [0.6, 0.6, 0.6]
              		},
              		"fixed": {
              			"rotation": [180, 0, 180],
              			"translation": [0, 0, 0.5],
              			"scale": [0.5, 0.5, 0.5]
              		}
              	}
            }
            """;

    public static String VERTICAL_EMPTY_WINDOW_DOWN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1.25, 12, 8.5],
             			"to": [2.25, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 12, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
             				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String VERTICAL_EMPTY_WINDOW_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 0, 6.5],
              			"to": [16, 1, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 15, 6.5],
              			"to": [16, 16, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
              				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 1, 6.5],
              			"to": [1, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [15, 1, 6.5],
              			"to": [16, 15, 9.5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
              			"faces": {
              				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
              				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
              				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
              				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 7.5],
              			"to": [12.5, 15, 8.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 20.5],
              			"to": [12.5, 15, 21.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
              				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
              				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 1, 8.5],
              			"to": [12.5, 2, 20.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [10.5, 14, 8.5],
              			"to": [12.5, 15, 20.5],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
              				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
              				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
              				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
              			}
              		},
              		{
              			"from": [12, 6, 20.25],
              			"to": [13, 10, 21.25],
              			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
              				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
              				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
              			}
              		}
              	],
              	"groups": [
              		0,
              		1,
              		2,
              		3,
              		{
              			"name": "door",
              			"origin": [8, 8, 7.5],
              			"color": 0,
              			"children": [4, 5, 6, 7, 8, 9]
              		}
              	]
            }
            """;

    public static String VERTICAL_EMPTY_WINDOW_OPEN_CENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 0, 7.5],
             			"to": [12.5, 16, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 0, 20.5],
             			"to": [12.5, 16, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [12, 0, 20.25],
             			"to": [13, 16, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 15, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [2, 3, 4, 5]
             		}
             	]
            }
            """;

    public static String VERTICAL_EMPTY_WINDOW_OPEN_UP = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 0, 7.5],
             			"to": [12.5, 15, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 0, 20.5],
             			"to": [12.5, 15, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 14, 8.5],
             			"to": [12.5, 15, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [12, 0, 20.25],
             			"to": [13, 4, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 3, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [3, 4, 5, 6, 7]
             		}
             	]
            }
            """;

    public static String VERTICAL_EMPTY_WINDOW_OPEN_DOWN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 7.5],
             			"to": [12.5, 16, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 20.5],
             			"to": [12.5, 16, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 8.5],
             			"to": [12.5, 2, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [12, 12, 20.25],
             			"to": [13, 16, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 14, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [3, 4, 5, 6, 7]
             		}
             	]
            }
            """;

    public static String VERTICAL_EMPTY_WINDOW_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 6.5],
            			"to": [16, 1, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 15, 6.5],
            			"to": [16, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 1, 6.5],
            			"to": [1, 15, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
            				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
            				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
            				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 1, 6.5],
            			"to": [16, 15, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
            				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
            				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
            				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14, 1, 7],
            			"to": [15, 15, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
            				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 1, 7],
            			"to": [2, 15, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
            				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 1, 7],
            			"to": [14, 2, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
            			"faces": {
            				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 14, 7],
            			"to": [14, 15, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
            			"faces": {
            				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.75, 6, 8.5],
            			"to": [14.75, 10, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 6, 8.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2.5, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2.5, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.75, 3.75, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.75, 3.75, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String VERTICAL_EMPTY_WINDOW_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 6.5],
            			"to": [16, 1, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 15, 6.5],
            			"to": [16, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 1, 6.5],
            			"to": [1, 15, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
            				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
            				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
            				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 1, 6.5],
            			"to": [16, 15, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
            				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
            				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
            				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 1, 7.5],
            			"to": [5.5, 15, 8.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
            				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
            				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 1, 20.5],
            			"to": [5.5, 15, 21.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
            				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
            				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 1, 8.5],
            			"to": [5.5, 2, 20.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 14, 8.5],
            			"to": [5.5, 15, 20.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [3, 6, 20.25],
            			"to": [4, 10, 21.25],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
            			}
            		}
            	],
            	"groups": [
            		0,
            		1,
            		2,
            		3,
            		{
            			"name": "door",
            			"origin": [8, 8, 7.5],
            			"color": 0,
            			"children": [4, 5, 6, 7, 8, 9]
            		}
            	]
            }
            """;

    public static String VERTICAL_EMPTY_WINDOW_CENTER_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 6.5],
            			"to": [1, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
            				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
            				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
            				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 0, 6.5],
            			"to": [16, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
            				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
            				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
            				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14, 0, 7],
            			"to": [15, 16, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 16], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 16], "texture": "#0"},
            				"south": {"uv": [1, 0, 0, 16], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 16], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 0, 7],
            			"to": [2, 16, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 16], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 16], "texture": "#0"},
            				"south": {"uv": [1, 0, 0, 16], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 16], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.75, 0, 8.5],
            			"to": [14.75, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 12, 8.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 16], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 16], "texture": "#2"},
            				"south": {"uv": [1, 0, 0, 16], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 16], "texture": "#2"},
            				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2.5, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2.5, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.75, 3.75, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.75, 3.75, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String VERTICAL_EMPTY_WINDOW_CENTER_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 6.5],
            			"to": [1, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
            				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
            				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
            				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 0, 6.5],
            			"to": [16, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
            				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
            				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
            				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 0, 7.5],
            			"to": [5.5, 16, 8.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 16], "texture": "#0"},
            				"east": {"uv": [1, 0, 0, 16], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 16], "texture": "#0"},
            				"west": {"uv": [1, 0, 0, 16], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 0, 20.5],
            			"to": [5.5, 16, 21.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 16], "texture": "#0"},
            				"east": {"uv": [1, 0, 0, 16], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 16], "texture": "#0"},
            				"west": {"uv": [1, 0, 0, 16], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [3, 0, 20.25],
            			"to": [4, 16, 21.25],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 15, 14.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 16], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 16], "texture": "#2"},
            				"south": {"uv": [1, 0, 0, 16], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 16], "texture": "#2"},
            				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
            			}
            		}
            	],
            	"groups": [
            		0,
            		1,
            		{
            			"name": "door",
            			"origin": [8, 8, 7.5],
            			"color": 0,
            			"children": [2, 3, 4, 5]
            		}
            	]
            }
            """;

    public static String VERTICAL_EMPTY_WINDOW_UP_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 15, 6.5],
            			"to": [16, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 6.5],
            			"to": [1, 15, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 1, 8, 14], "texture": "#0"},
            				"east": {"uv": [6, 1, 9, 14], "texture": "#0"},
            				"south": {"uv": [7, 1, 8, 14], "texture": "#0"},
            				"west": {"uv": [6, 1, 9, 14], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 0, 6.5],
            			"to": [16, 15, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 1, 8, 14], "texture": "#0"},
            				"east": {"uv": [6, 1, 9, 14], "texture": "#0"},
            				"south": {"uv": [7, 1, 8, 14], "texture": "#0"},
            				"west": {"uv": [6, 1, 9, 14], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14, 0, 7],
            			"to": [15, 15, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 0, 7],
            			"to": [2, 15, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 14, 7],
            			"to": [14, 15, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
            			"faces": {
            				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.75, 0, 8.5],
            			"to": [14.75, 4, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 0, 8.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2.5, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2.5, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.75, 3.75, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.75, 3.75, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String VERTICAL_EMPTY_WINDOW_UP_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 15, 6.5],
            			"to": [16, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 6.5],
            			"to": [1, 15, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 1, 8, 16], "texture": "#0"},
            				"east": {"uv": [6, 1, 9, 16], "texture": "#0"},
            				"south": {"uv": [7, 1, 8, 16], "texture": "#0"},
            				"west": {"uv": [6, 1, 9, 16], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 0, 6.5],
            			"to": [16, 15, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 1, 8, 16], "texture": "#0"},
            				"east": {"uv": [6, 1, 9, 16], "texture": "#0"},
            				"south": {"uv": [7, 1, 8, 16], "texture": "#0"},
            				"west": {"uv": [6, 1, 9, 16], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 0, 7.5],
            			"to": [5.5, 15, 8.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"east": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"west": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 0, 20.5],
            			"to": [5.5, 15, 21.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"east": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"west": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 14, 8.5],
            			"to": [5.5, 15, 20.5],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
            			"faces": {
            				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [3, 0, 20.25],
            			"to": [4, 4, 21.25],
            			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 3, 14.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
            			}
            		}
            	],
            	"groups": [
            		0,
            		1,
            		2,
            		{
            			"name": "door",
            			"origin": [8, 8, 7.5],
            			"color": 0,
            			"children": [3, 4, 5, 6, 7]
            		}
            	]
            }
            """;

    public static String VERTICAL_EMPTY_WINDOW_DOWN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 6.5],
            			"to": [16, 1, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 1, 6.5],
            			"to": [1, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
            				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
            				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
            				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 1, 6.5],
            			"to": [16, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
            				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
            				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
            				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
            				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
            				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14, 1, 7],
            			"to": [15, 16, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 1, 7],
            			"to": [2, 16, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
            				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 1, 7],
            			"to": [14, 2, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
            			"faces": {
            				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
            				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.75, 12, 8.5],
            			"to": [14.75, 16, 9.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 12, 8.5]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
            				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2.5, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2.5, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.75, 3.75, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.75, 3.75, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String VERTICAL_EMPTY_WINDOW_DOWN_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 7.5],
             			"to": [5.5, 16, 8.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 20.5],
             			"to": [5.5, 16, 21.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 8.5],
             			"to": [5.5, 2, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3, 12, 20.25],
             			"to": [4, 16, 21.25],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 14, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [3, 4, 5, 6, 7]
             		}
             	]
            }
            """;

    public static String FOURPANE_EMPTY_WINDOW = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 2, 7],
             			"to": [8.5, 14, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"east": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"south": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"west": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"up": {"uv": [0, 1, 1, 3], "texture": "#0"},
             				"down": {"uv": [0, 1, 1, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.0001],
             			"to": [14, 8.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1.25, 6, 8.5],
             			"to": [2.25, 10, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 6, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
             				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_EMPTY_WINDOW_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 7.5],
             			"to": [12.5, 15, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 20.5],
             			"to": [12.5, 15, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13, 2, 14.5],
             			"to": [15, 14, 15.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [14.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"east": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"south": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"west": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"up": {"uv": [1, 3, 0, 1], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 3, 0, 1], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 8.5],
             			"to": [12.5, 2, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 14, 8.5],
             			"to": [12.5, 15, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 7.5, 8.5],
             			"to": [12.5, 8.5, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 1.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [12, 6, 20.25],
             			"to": [13, 10, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		3,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
             		}
             	]
            }
            """;

    public static String FOURPANE_EMPTY_WINDOW_LEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.75],
             			"to": [16, 15, 9.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 2, 7],
             			"to": [8.5, 14, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 1, 0, 13], "texture": "#0"},
             				"east": {"uv": [2, 1, 0, 13], "texture": "#0"},
             				"south": {"uv": [1, 1, 0, 13], "texture": "#0"},
             				"west": {"uv": [2, 1, 0, 13], "texture": "#0"},
             				"up": {"uv": [1, 1, 0, 3], "texture": "#0"},
             				"down": {"uv": [1, 1, 0, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.0001],
             			"to": [14, 8.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.75, 6, 8.5],
             			"to": [14.75, 10, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 6, 8.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
             			}
             		}
             	]
            }
            """;

    public static String FOURPANE_EMPTY_WINDOW_LEFT_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.75],
             			"to": [16, 15, 9.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 8.5, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 8.5, 15], "texture": "#0"},
             				"up": {"uv": [7, 8, 8, 10.5], "texture": "#0"},
             				"down": {"uv": [7, 8, 8, 10.5], "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 7.5],
             			"to": [5.5, 15, 8.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 20.5],
             			"to": [5.5, 15, 21.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 2, 14.5],
             			"to": [3, 14, 15.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [1.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [2, 1, 0, 13], "texture": "#0"},
             				"east": {"uv": [1, 1, 0, 13], "texture": "#0"},
             				"south": {"uv": [2, 1, 0, 13], "texture": "#0"},
             				"west": {"uv": [1, 1, 0, 13], "texture": "#0"},
             				"up": {"uv": [1, 1, 0, 3], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 1, 0, 3], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 8.5],
             			"to": [5.5, 2, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 14, 8.5],
             			"to": [5.5, 15, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 7.5, 8.5],
             			"to": [5.5, 8.5, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 1.5, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3, 6, 20.25],
             			"to": [4, 10, 21.25],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		3,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
             		}
             	]
            }
            """;

    public static String FOURPANE_EMPTY_WINDOW_RIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.75],
             			"to": [1, 15, 9.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 2, 7],
             			"to": [8.5, 14, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"east": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"south": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"west": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"up": {"uv": [0, 1, 1, 3], "texture": "#0"},
             				"down": {"uv": [0, 1, 1, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.0001],
             			"to": [14, 8.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1.25, 6, 8.5],
             			"to": [2.25, 10, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 6, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
             				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
             			}
             		}
             	]
            }
            """;

    public static String FOURPANE_EMPTY_WINDOW_RIGHT_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.75],
             			"to": [1, 15, 9.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 8.5, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 8.5, 15], "texture": "#0"},
             				"up": {"uv": [7, 8, 8, 10.5], "texture": "#0"},
             				"down": {"uv": [7, 8, 8, 10.5], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 7.5],
             			"to": [12.5, 15, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 20.5],
             			"to": [12.5, 15, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13, 2, 14.5],
             			"to": [15, 14, 15.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [14.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"east": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"south": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"west": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"up": {"uv": [1, 3, 0, 1], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 3, 0, 1], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 8.5],
             			"to": [12.5, 2, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 14, 8.5],
             			"to": [12.5, 15, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 7.5, 8.5],
             			"to": [12.5, 8.5, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 1.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [12, 6, 20.25],
             			"to": [13, 10, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		3,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
             		}
             	]
            }
            """;

    public static String FOURPANE_EMPTY_WINDOW_CENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.75],
             			"to": [1, 15, 9.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.75],
             			"to": [16, 15, 9.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 2, 7],
             			"to": [8.5, 14, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.0001],
             			"to": [14, 8.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		}
             	]
            }
            """;

    public static String FOURPANE_EMPTY_WINDOW_CENTER_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.75],
             			"to": [1, 15, 9.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.75],
             			"to": [16, 15, 9.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 2, 7],
             			"to": [8.5, 14, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.0001],
             			"to": [14, 8.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		}
             	]
            }
            """;

    public static String FOURPANE_VERTICAL_EMPTY_WINDOW = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 2, 7],
             			"to": [8.5, 14, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"east": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"south": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"west": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"up": {"uv": [0, 1, 1, 3], "texture": "#0"},
             				"down": {"uv": [0, 1, 1, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.0001],
             			"to": [14, 8.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1.25, 6, 8.5],
             			"to": [2.25, 10, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 6, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
             				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_VERTICAL_EMPTY_WINDOW_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 7.5],
             			"to": [12.5, 15, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 20.5],
             			"to": [12.5, 15, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13, 2, 14.5],
             			"to": [15, 14, 15.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [14.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"east": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"south": {"uv": [0, 1, 2, 13], "texture": "#0"},
             				"west": {"uv": [0, 1, 1, 13], "texture": "#0"},
             				"up": {"uv": [1, 3, 0, 1], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 3, 0, 1], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 8.5],
             			"to": [12.5, 2, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 14, 8.5],
             			"to": [12.5, 15, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 7.5, 8.5],
             			"to": [12.5, 8.5, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 1.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [12, 6, 20.25],
             			"to": [13, 10, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		3,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
             		}
             	]
            }
            """;

    public static String FOURPANE_VERTICAL_EMPTY_WINDOW_UP = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 14], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 14], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 14], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 14], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 14], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 14], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 14], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 14], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 0, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 0, 7],
             			"to": [8.5, 14, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 0, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 6.5, 7.0001],
             			"to": [14, 7.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1.25, 0, 8.5],
             			"to": [2.25, 4, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 0, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
             				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_VERTICAL_EMPTY_WINDOW_UP_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 0, 7.5],
             			"to": [12.5, 15, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 0, 20.5],
             			"to": [12.5, 15, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13, 0, 14.5],
             			"to": [15, 14, 15.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [14.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 14, 8.5],
             			"to": [12.5, 15, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 6.5, 8.5],
             			"to": [12.5, 7.5, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 0.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [12, 0, 20.25],
             			"to": [13, 4, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 3, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
             		}
             	]
            }
            """;

    public static String FOURPANE_VERTICAL_EMPTY_WINDOW_DOWN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 2, 7],
             			"to": [8.5, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 8.5, 7.0001],
             			"to": [14, 9.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 9, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 12, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 12, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1.25, 12, 8.5],
             			"to": [2.25, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 12, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
             				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_VERTICAL_EMPTY_WINDOW_DOWN_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 7.5],
             			"to": [12.5, 16, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 20.5],
             			"to": [12.5, 16, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13, 2, 14.5],
             			"to": [15, 16, 15.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [14.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 1, 8.5],
             			"to": [12.5, 2, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 8.5, 8.5],
             			"to": [12.5, 9.5, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 15.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 12, 1], "texture": "#0"},
             				"up": {"uv": [12, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [12, 12, 20.25],
             			"to": [13, 16, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 14, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 4], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
             		}
             	]
            }
            """;

    public static String FOURPANE_VERTICAL_EMPTY_WINDOW_CENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 0, 7],
             			"to": [2, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 0, 7],
             			"to": [8.5, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 0, 7],
             			"to": [15, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"up": {"uv": [0, 0, 1, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 1, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1.25, 0, 8.5],
             			"to": [2.25, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.25, 12, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"up": {"uv": [0, 0, 1, 1], "texture": "#2"},
             				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.001],
             			"to": [14, 8.5, 9.001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [2, 7, 14, 8], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"south": {"uv": [2, 7, 14, 8], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"up": {"uv": [2, 7, 14, 9], "texture": "#0"},
             				"down": {"uv": [2, 7, 14, 9], "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_VERTICAL_EMPTY_WINDOW_CENTER_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 0, 7.5],
             			"to": [12.5, 16, 8.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [10.5, 0, 20.5],
             			"to": [12.5, 16, 21.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13, 0, 14.5],
             			"to": [15, 16, 15.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [14.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 0], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 0], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [12, 0, 20.25],
             			"to": [13, 16, 21.25],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 15, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"east": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"west": {"uv": [0, 0, 1, 16], "texture": "#2"},
             				"up": {"uv": [1, 1, 0, 0], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 1, 0, 0], "rotation": 90, "texture": "#2"}
             			}
             		},
             		{
             			"from": [10.5, 7.5, 8.5],
             			"to": [12.5, 8.5, 20.5],
             			"rotation": {"angle": -22.5, "axis": "y", "origin": [12, 1.5, 14.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [2, 6, 14, 7], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [2, 6, 14, 7], "texture": "#0"},
             				"up": {"uv": [14, 8, 2, 6], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [14, 8, 2, 6], "rotation": 90, "texture": "#0"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [2, 3, 4, 5, 6, 7, 8, 9, 10]
             		}
             	]
            }
            """;

    public static String FOURPANE_VERTICAL_EMPTY_WINDOW_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 2, 7],
             			"to": [8.5, 14, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 2, 0, 14], "texture": "#0"},
             				"east": {"uv": [2, 2, 0, 14], "texture": "#0"},
             				"south": {"uv": [1, 2, 0, 14], "texture": "#0"},
             				"west": {"uv": [2, 2, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.0001],
             			"to": [14, 8.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8.1]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.75, 6, 8.5],
             			"to": [14.75, 10, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 6, 8.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_VERTICAL_EMPTY_WINDOW_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 7.5],
             			"to": [5.5, 15, 8.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 20.5],
             			"to": [5.5, 15, 21.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 2, 14.5],
             			"to": [3, 14, 15.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [1.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [2, 2, 0, 14], "texture": "#0"},
             				"east": {"uv": [1, 2, 0, 14], "texture": "#0"},
             				"south": {"uv": [2, 2, 0, 14], "texture": "#0"},
             				"west": {"uv": [1, 2, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 2, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 2, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 8.5],
             			"to": [5.5, 2, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 7.5, 8.5],
             			"to": [5.5, 8.5, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 14.5, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 14, 8.5],
             			"to": [5.5, 15, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3, 6, 20.25],
             			"to": [4, 10, 21.25],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		3,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
             		}
             	]
            }
            """;

    public static String FOURPANE_VERTICAL_EMPTY_WINDOW_UP_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 14], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 14], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 14], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 14], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 14], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 14], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 14], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 14], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 0, 7],
             			"to": [15, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 0, 7],
             			"to": [8.5, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 0, 7],
             			"to": [2, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 14, 7],
             			"to": [14, 15, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 6.5, 7],
             			"to": [14, 7.5, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.75, 0, 8.5],
             			"to": [14.75, 4, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 0, 8.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_VERTICAL_EMPTY_WINDOW_UP_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 15, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 15, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 1, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 1, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 0, 7.5],
             			"to": [5.5, 15, 8.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 0, 20.5],
             			"to": [5.5, 15, 21.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 0, 14.5],
             			"to": [3, 14, 15.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [1.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [2, 1, 0, 15], "texture": "#0"},
             				"east": {"uv": [1, 1, 0, 15], "texture": "#0"},
             				"south": {"uv": [2, 1, 0, 15], "texture": "#0"},
             				"west": {"uv": [1, 1, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 1, 0, 3], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 1, 0, 3], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 14, 8.5],
             			"to": [5.5, 15, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 6.5, 8.5],
             			"to": [5.5, 7.5, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 0.5, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3, 0, 20.25],
             			"to": [4, 4, 21.25],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 3, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
             		}
             	]
            }
            """;

    public static String FOURPANE_VERTICAL_EMPTY_WINDOW_DOWN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 1, 7],
             			"to": [15, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 1, 7],
             			"to": [2, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 1, 7],
             			"to": [8.5, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 1, 7],
             			"to": [14, 2, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 8.5, 7.0001],
             			"to": [14, 9.5, 9.0001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 9, 8]},
             			"faces": {
             				"north": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.75, 12, 8.5],
             			"to": [14.75, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 12, 8.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_VERTICAL_EMPTY_WINDOW_DOWN_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [16, 1, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [6, 3, 9, 4], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 1, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 1, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 15], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 15], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 7.5],
             			"to": [5.5, 16, 8.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 20.5],
             			"to": [5.5, 16, 21.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 15], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 15], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 2, 14.5],
             			"to": [3, 16, 15.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [1.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 14], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 14], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 1, 8.5],
             			"to": [5.5, 2, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 8.5, 8.5],
             			"to": [5.5, 9.5, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 15.5, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"east": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 1], "texture": "#0"},
             				"west": {"uv": [12, 0, 0, 1], "texture": "#0"},
             				"up": {"uv": [12, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [12, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3, 12, 20.25],
             			"to": [4, 16, 21.25],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 14, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 4], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		2,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
             		}
             	]
            }
            """;

    public static String FOURPANE_VERTICAL_EMPTY_WINDOW_CENTER_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 0, 7],
             			"to": [15, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 0, 7],
             			"to": [2, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [7.5, 0, 7],
             			"to": [8.5, 16, 9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"east": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"south": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"west": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.75, 0, 8.5],
             			"to": [14.75, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.75, 12, 8.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 16], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 16], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 16], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 16], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
             			}
             		},
             		{
             			"from": [2, 7.5, 7.001],
             			"to": [14, 8.5, 9.001],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 8.1]},
             			"faces": {
             				"north": {"uv": [14, 5, 2, 6], "texture": "#0"},
             				"east": {"uv": [4, 5, 2, 6], "texture": "#0"},
             				"south": {"uv": [14, 5, 2, 6], "texture": "#0"},
             				"west": {"uv": [4, 5, 2, 6], "texture": "#0"},
             				"up": {"uv": [14, 5, 2, 7], "texture": "#0"},
             				"down": {"uv": [14, 5, 2, 7], "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2.5, 2, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0.75, 3.75, 1.5],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [180, 0, 180],
             			"translation": [0, 0, 0.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String FOURPANE_VERTICAL_EMPTY_WINDOW_CENTER_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		
            		"2": "HANDLE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 6.5],
             			"to": [1, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [15, 0, 6.5],
             			"to": [16, 16, 9.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 8]},
             			"faces": {
             				"north": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"east": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"south": {"uv": [7, 0, 8, 16], "texture": "#0"},
             				"west": {"uv": [6, 0, 9, 16], "texture": "#0"},
             				"up": {"uv": [7, 7, 8, 10], "texture": "#0"},
             				"down": {"uv": [7, 7, 8, 10], "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 0, 7.5],
             			"to": [5.5, 16, 8.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3.5, 0, 20.5],
             			"to": [5.5, 16, 21.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 8, 14.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 0, 14.5],
             			"to": [3, 16, 15.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [1.5, 8, 8.5]},
             			"faces": {
             				"north": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"east": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"south": {"uv": [2, 0, 0, 16], "texture": "#0"},
             				"west": {"uv": [1, 0, 0, 16], "texture": "#0"},
             				"up": {"uv": [1, 0, 0, 2], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [1, 0, 0, 2], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [3, 0, 20.25],
             			"to": [4, 16, 21.25],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 15, 14.5]},
             			"faces": {
             				"north": {"uv": [1, 0, 0, 16], "texture": "#2"},
             				"east": {"uv": [1, 0, 0, 16], "texture": "#2"},
             				"south": {"uv": [1, 0, 0, 16], "texture": "#2"},
             				"west": {"uv": [1, 0, 0, 16], "texture": "#2"},
             				"up": {"uv": [1, 0, 0, 1], "rotation": 270, "texture": "#2"},
             				"down": {"uv": [1, 0, 0, 1], "rotation": 90, "texture": "#2"}
             			}
             		},
             		{
             			"from": [3.5, 7.5, 8.5],
             			"to": [5.5, 8.5, 20.5],
             			"rotation": {"angle": 22.5, "axis": "y", "origin": [4, 14.5, 14.5]},
             			"faces": {
             				"north": {"uv": [4, 5, 2, 6], "texture": "#0"},
             				"east": {"uv": [14, 6, 2, 7], "texture": "#0"},
             				"south": {"uv": [4, 5, 2, 6], "texture": "#0"},
             				"west": {"uv": [14, 6, 2, 7], "texture": "#0"},
             				"up": {"uv": [14, 5, 2, 7], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [14, 5, 2, 7], "rotation": 90, "texture": "#0"}
             			}
             		}
             	],
             	"groups": [
             		0,
             		1,
             		{
             			"name": "door",
             			"origin": [8, 8, 7.5],
             			"color": 0,
             			"children": [2, 3, 4, 5, 6, 7, 8, 9, 10]
             		}
             	]
            }
            """;
}