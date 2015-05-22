/**
 * Adobe Edge: symbol definitions
 */
(function($, Edge, compId){
//images folder
var im='images/';

var fonts = {};
var opts = {
    'gAudioPreloadPreference': 'auto',

    'gVideoPreloadPreference': 'auto'
};
var resources = [
];
var symbols = {
"stage": {
    version: "4.0.0",
    minimumCompatibleVersion: "4.0.0",
    build: "4.0.0.359",
    baseState: "Base State",
    scaleToFit: "height",
    centerStage: "both",
    initialState: "Base State",
    gpuAccelerate: false,
    resizeInstances: false,
    content: {
            dom: [
            {
                id: 'page_bg_color',
                type: 'rect',
                rect: ['0px', '0px','720px','1281px','auto', 'auto'],
                fill: ["rgba(235,235,235,1.00)"],
                stroke: [0,"rgb(0, 0, 0)","none"]
            },
            {
                id: 'Text2Copy4',
                type: 'text',
                rect: ['11.1%', '43.9%','auto','auto','auto', 'auto'],
                text: "姓名",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(55,155,220,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy6',
                type: 'text',
                rect: ['32.2%', '27.5%','auto','auto','auto', 'auto'],
                text: "完善您的名片信息",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(150,150,150,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy7',
                type: 'text',
                rect: ['24.4%', '31.5%','auto','auto','auto', 'auto'],
                text: "就能与",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(150,150,150,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy9',
                type: 'text',
                rect: ['38.9%', '31.5%','auto','auto','auto', 'auto'],
                text: "曲雨水",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(50,50,50,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy8',
                type: 'text',
                rect: ['53.1%', '31.5%','auto','auto','auto', 'auto'],
                text: "交换名片啦！",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(150,150,150,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy3',
                type: 'text',
                rect: ['11.1%', '50.2%','auto','auto','auto', 'auto'],
                text: "职位",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(55,155,220,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy2',
                type: 'text',
                rect: ['11.1%', '56.4%','auto','auto','auto', 'auto'],
                text: "公司",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(55,155,220,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy',
                type: 'text',
                rect: ['11.1%', '62.4%','auto','auto','auto', 'auto'],
                text: "手机",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(55,155,220,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2',
                type: 'text',
                rect: ['11.1%', '68.8%','auto','auto','auto', 'auto'],
                text: "验证码",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(55,155,220,1.00)", "400", "none", "normal"]
            },
            {
                id: 'download_bar_bg_color',
                type: 'rect',
                rect: ['0px', '1185px','720px','95px','auto', 'auto'],
                fill: ["rgba(33,33,33,1.00)"],
                stroke: [0,"rgba(0,0,0,1)","none"]
            },
            {
                id: 'RoundRect',
                type: 'rect',
                rect: ['537px', '1203px','160px','60px','auto', 'auto'],
                borderRadius: ["10px", "10px", "10px", "10px"],
                fill: ["rgba(55,155,220,1.00)"],
                stroke: [0,"rgb(0, 0, 0)","none"]
            },
            {
                id: 'Text',
                type: 'text',
                rect: ['590px', '1216px','auto','auto','auto', 'auto'],
                text: "下载",
                font: ['Arial, Helvetica, sans-serif', 28, "rgba(251,251,251,1.00)", "normal", "none", ""]
            },
            {
                id: 'RoundRectCopy',
                type: 'rect',
                rect: ['430px', '867px','210px','60px','auto', 'auto'],
                borderRadius: ["10px", "10px", "10px", "10px"],
                fill: ["rgba(55,155,220,1.00)"],
                stroke: [0,"rgb(0, 0, 0)","none"]
            },
            {
                id: 'TextCopy',
                type: 'text',
                rect: ['474px', '884px','auto','auto','auto', 'auto'],
                text: "获取验证码",
                font: ['Arial, Helvetica, sans-serif', 24, "rgba(251,251,251,1.00)", "normal", "none", ""]
            },
            {
                id: 'profile_background',
                type: 'image',
                rect: ['33.3%', '6.6%','240px','240px','auto', 'auto'],
                fill: ["rgba(0,0,0,0)",im+"profile_background.png",'0px','0px']
            },
            {
                id: 'download_button',
                type: 'rect',
                rect: ['11.1%', '81.5%','559px','88px','auto', 'auto'],
                borderRadius: ["11px 11px", "11px 11px", "11px 11px", "11px 11px"],
                fill: ["rgba(55,155,220,0.00)"],
                stroke: [1,"rgba(55,155,220,1.00)","solid"]
            },
            {
                id: 'Text2Copy5',
                type: 'text',
                rect: ['41.1%', '83.5%','auto','auto','auto', 'auto'],
                text: "交换名片",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(55,155,220,1.00)", "400", "none", "normal"]
            },
            {
                id: 'logo_slogan',
                type: 'image',
                rect: ['7px', '1192px','390px','80px','auto', 'auto'],
                fill: ["rgba(0,0,0,0)",'An%20element/logo_slogan.png','0px','0px']
            },
            {
                id: 'input_zone_large',
                type: 'image',
                rect: ['190px', '547px','452px','66px','auto', 'auto'],
                fill: ["rgba(0,0,0,0)",'An%20element/input_zone_large.png','0px','0px']
            },
            {
                id: 'input_zone_largeCopy2',
                type: 'image',
                rect: ['190px', '627px','452px','66px','auto', 'auto'],
                fill: ["rgba(0,0,0,0)",'An%20element/input_zone_large.png','0px','0px']
            },
            {
                id: 'input_zone_largeCopy3',
                type: 'image',
                rect: ['190px', '707px','452px','66px','auto', 'auto'],
                fill: ["rgba(0,0,0,0)",'An%20element/input_zone_large.png','0px','0px']
            },
            {
                id: 'input_zone_largeCopy4',
                type: 'image',
                rect: ['190px', '785px','452px','66px','auto', 'auto'],
                fill: ["rgba(0,0,0,0)",'An%20element/input_zone_large.png','0px','0px']
            },
            {
                id: 'input_zone_small',
                type: 'image',
                rect: ['190px', '865px','232px','66px','auto', 'auto'],
                fill: ["rgba(0,0,0,0)",'An%20element/input_zone_small.png','0px','0px']
            }],
            symbolInstances: [

            ]
        },
    states: {
        "Base State": {
            "${_RoundRect}": [
                ["style", "top", '1203px'],
                ["style", "height", '60px'],
                ["color", "background-color", 'rgba(55,155,220,1.00)'],
                ["style", "left", '537px'],
                ["style", "width", '160px']
            ],
            "${_Text2Copy}": [
                ["style", "top", '62.42%'],
                ["color", "color", 'rgba(55,155,220,1)'],
                ["style", "left", '11.11%'],
                ["style", "font-size", '32px']
            ],
            "${_download_bar_bg_color}": [
                ["style", "top", '1185px'],
                ["style", "height", '95px'],
                ["color", "background-color", 'rgba(33,33,33,1.00)'],
                ["style", "left", '0px'],
                ["style", "width", '720px']
            ],
            "${_Text2Copy9}": [
                ["color", "color", 'rgba(50,50,50,1.00)'],
                ["style", "top", '31.48%'],
                ["style", "left", '38.89%'],
                ["style", "font-size", '32px']
            ],
            "${_Text2Copy3}": [
                ["color", "color", 'rgba(55,155,220,1)'],
                ["style", "top", '50.16%'],
                ["style", "left", '11.11%'],
                ["style", "font-size", '32px']
            ],
            "${_logo_slogan}": [
                ["style", "left", '7px'],
                ["style", "top", '1192px']
            ],
            "${_Text2Copy8}": [
                ["color", "color", 'rgba(150,150,150,1.00)'],
                ["style", "top", '31.48%'],
                ["style", "left", '53.06%'],
                ["style", "font-size", '32px']
            ],
            "${_Text2Copy2}": [
                ["style", "top", '56.41%'],
                ["color", "color", 'rgba(55,155,220,1)'],
                ["style", "left", '11.11%'],
                ["style", "font-size", '32px']
            ],
            "${_input_zone_largeCopy2}": [
                ["style", "top", '627px'],
                ["style", "left", '190px'],
                ["style", "width", '452px']
            ],
            "${_input_zone_large}": [
                ["style", "top", '547px'],
                ["style", "left", '190px'],
                ["style", "width", '452px']
            ],
            "${_page_bg_color}": [
                ["style", "top", '0px'],
                ["style", "height", '1281px'],
                ["color", "background-color", 'rgba(235,235,235,1.00)']
            ],
            "${_Stage}": [
                ["color", "background-color", 'rgba(255,255,255,1)'],
                ["style", "width", '720px'],
                ["style", "height", '1280px'],
                ["style", "overflow", 'auto']
            ],
            "${_Text2}": [
                ["color", "color", 'rgba(55,155,220,1)'],
                ["style", "top", '68.75%'],
                ["style", "left", '11.11%'],
                ["style", "font-size", '32px']
            ],
            "${_Text2Copy4}": [
                ["style", "top", '43.91%'],
                ["color", "color", 'rgba(55,155,220,1)'],
                ["style", "left", '11.11%'],
                ["style", "font-size", '32px']
            ],
            "${_input_zone_small}": [
                ["style", "left", '190px'],
                ["style", "top", '865px']
            ],
            "${_Text2Copy7}": [
                ["style", "top", '31.48%'],
                ["color", "color", 'rgba(150,150,150,1.00)'],
                ["style", "left", '24.44%'],
                ["style", "font-size", '32px']
            ],
            "${_input_zone_largeCopy3}": [
                ["style", "top", '707px'],
                ["style", "left", '190px'],
                ["style", "width", '452px']
            ],
            "${_RoundRectCopy}": [
                ["style", "top", '867px'],
                ["style", "height", '60px'],
                ["color", "background-color", 'rgba(55,155,220,1.00)'],
                ["style", "left", '430px'],
                ["style", "width", '210px']
            ],
            "${_Text2Copy5}": [
                ["style", "top", '83.52%'],
                ["color", "color", 'rgba(55,155,220,1)'],
                ["style", "left", '41.11%'],
                ["style", "font-size", '32px']
            ],
            "${_Text}": [
                ["style", "top", '1216px'],
                ["color", "color", 'rgba(251,251,251,1.00)'],
                ["style", "left", '590px'],
                ["style", "font-size", '28px']
            ],
            "${_Text2Copy6}": [
                ["color", "color", 'rgba(150,150,150,1.00)'],
                ["style", "top", '27.5%'],
                ["style", "left", '32.22%'],
                ["style", "font-size", '32px']
            ],
            "${_input_zone_largeCopy4}": [
                ["style", "top", '785px'],
                ["style", "left", '190px'],
                ["style", "width", '452px']
            ],
            "${_download_button}": [
                ["color", "background-color", 'rgba(55,155,220,0)'],
                ["style", "border-top-left-radius", [11,11], {valueTemplate:'@@0@@px @@1@@px'} ],
                ["style", "border-bottom-right-radius", [11,11], {valueTemplate:'@@0@@px @@1@@px'} ],
                ["style", "border-style", 'solid'],
                ["style", "border-top-right-radius", [11,11], {valueTemplate:'@@0@@px @@1@@px'} ],
                ["style", "width", '559px'],
                ["style", "top", '81.48%'],
                ["style", "border-bottom-left-radius", [11,11], {valueTemplate:'@@0@@px @@1@@px'} ],
                ["style", "height", '88px'],
                ["color", "border-color", 'rgb(55, 155, 220)'],
                ["style", "border-width", '1px'],
                ["style", "left", '11.11%']
            ],
            "${_TextCopy}": [
                ["color", "color", 'rgba(251,251,251,1.00)'],
                ["style", "top", '884px'],
                ["style", "left", '474px'],
                ["style", "font-size", '24px']
            ],
            "${_profile_background}": [
                ["style", "top", '6.56%'],
                ["style", "left", '33.33%']
            ]
        }
    },
    timelines: {
        "Default Timeline": {
            fromState: "Base State",
            toState: "",
            duration: 0,
            autoPlay: true,
            timeline: [
            ]
        }
    }
}
};


Edge.registerCompositionDefn(compId, symbols, fonts, resources, opts);

/**
 * Adobe Edge DOM Ready Event Handler
 */
$(window).ready(function() {
     Edge.launchComposition(compId);
});
})(jQuery, AdobeEdge, "EDGE-1436255");
