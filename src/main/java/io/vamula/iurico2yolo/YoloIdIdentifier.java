package io.vamula.iurico2yolo;

public class YoloIdIdentifier {
	public static int getId(RicoComponent ricoComponent) {
		switch (ricoComponent.getType()) {
		case "general": return getGeneralId(ricoComponent);
		case "icon": return getIconId(ricoComponent);
		case "text-button": return getTextButtonId(ricoComponent);
		default: throw new RuntimeException("Undefined component type \'" + ricoComponent.getType() + "\'");
		}
	}
	
	private static int getGeneralId(RicoComponent ricoComponent) {
		switch (ricoComponent.getLabel()) {
		case "Advertisement": return 0;
		case "Background Image": return 1;
		case "Bottom Navigation": return 2;
		case "Button Bar": return 3;
		case "Card": return 4;
		case "Checkbox": return 5;
		case "Drawer (Parent)": return 6;
		case "Date Picker": return 7;
		case "Image": return 8;
		case "Image Button": return 9;
		case "Input": return 10;
		case "List Item (Parent)": return 11;
		case "Map View": return 12;
		case "Multi-Tab": return 13;
		case "Number Stepper": return 14;
		case "On/Off Switch": return 15;
		case "Pager Indicator": return 16;
		case "Radio Button": return 17;
		case "Slider": return 18;
		case "Text Button": return 19;
		case "Toolbar": return 20;
		case "Video": return 21;
		case "Web View": return 22;
		default: throw new RuntimeException("Undefined component \'" + ricoComponent.getLabel() + "\'");
		}
	}
	
	private static int getIconId(RicoComponent ricoComponent) {
		switch (ricoComponent.getLabel()) {
		case "no" : return 23;
		case "login" : return 24;
		case "back" : return 25;
		case "go" : return 26;
		case "ok" : return 27;
		case "all" : return 28;
		case "next" : return 29;
		case "add" : return 30;
		case "create" : return 31;
		case "more" : return 32;
		case "retry" : return 33;
		case "skip" : return 34;
		case "set" : return 35;
		case "delete" : return 36;
		case "facebook" : return 37;
		case "view" : return 38;
		case "book" : return 39;
		case "continue" : return 40;
		case "list" : return 41;
		case "save" : return 42;
		case "search" : return 43;
		case "finish" : return 44;
		case "agree" : return 45;
		case "show" : return 46;
		case "share" : return 47;
		case "buy" : return 48;
		case "update" : return 49;
		case "edit" : return 50;
		default: throw new RuntimeException("Undefined component \'" + ricoComponent.getLabel() + "\'");
		}
	}
	
	private static int getTextButtonId(RicoComponent ricoComponent) {
		switch (ricoComponent.getLabel()) {
		case "more": return 51;
		case "close": return 52;
		case "menu": return 53;
		case "search": return 54;
		case "add": return 55;
		case "share": return 56;
		case "check": return 57;
		case "star": return 58;
		case "favorite": return 59;
		case "play": return 60;
		case "avatar": return 61;
		case "arrow_forward": return 62;
		case "switcher": return 63;
		case "settings": return 64;
		case "refresh": return 65;
		case "info": return 66;
		case "edit": return 67;
		case "location_crossh": return 68;
		case "chat": return 69;
		case "photo": return 70;
		case "expand_more": return 71;
		case "help": return 72;
		case "facebook": return 73;
		case "volume": return 74;
		case "home": return 75;
		case "pause": return 76;
		case "microphone": return 77;
		case "delete": return 78;
		case "notifications": return 79;
		case "filter_list": return 80;
		case "email": return 81;
		case "list": return 82;
		case "twitter": return 83;
		case "location": return 84;
		case "bookmark": return 85;
		case "time": return 86;
		case "emoji": return 87;
		case "sliders": return 88;
		case "call": return 89;
		case "minus": return 90;
		case "file_download": return 91;
		case "wallpaper": return 92;
		case "cart": return 93;
		case "undo": return 94;
		case "layers": return 95;
		case "save": return 96;
		case "lock": return 97;
		case "visibility": return 98;
		case "follow": return 99;
		case "send": return 100;
		case "av_rewind": return 101;
		case "filter": return 102;
		case "fullscreen": return 103;
		case "thumbs_up": return 104;
		case "data_range": return 105;
		case "skip next": return 106;
		case "av_forward": return 107;
		case "group": return 108;
		case "globe": return 109;
		case "book": return 110;
		case "arrow_upward": return 111;
		case "font": return 112;
		case "skip_previous": return 113;
		case "folder": return 114;
		case "national flag": return 115;
		case "navigation": return 116;
		case "weather": return 117;
		case "build": return 118;
		case "dashboard": return 119;
		case "expand less": return 120;
		case "thumbs down": return 121;
		case "dialpad": return 122;
		case "music": return 123;
		case "redo": return 124;
		case "gift": return 125;
		case "warning": return 126;
		case "bluetooth": return 127;
		case "videocam": return 128;
		case "label": return 129;
		case "arrow_backward": return 130;
		default: throw new RuntimeException("Undefined component \'" + ricoComponent.getLabel() + "\'");
		}
	}
}