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
    centerStage: "horizontal",
    initialState: "Base State",
    gpuAccelerate: false,
    resizeInstances: false,
    content: {
            dom: [
            {
                id: 'background_image',
                type: 'image',
                rect: ['0px', '0px','720px','1280px','auto', 'auto'],
                fill: ["rgba(0,0,0,0)",'An%20element/background_image.png','0px','0px']
            },
            {
                id: 'Rectangle2',
                type: 'rect',
                rect: ['0%', '92.5%','720px','96px','auto', 'auto'],
                fill: ["rgba(35,35,35,1.00)"],
                stroke: [0,"rgb(0, 0, 0)","none"]
            },
            {
                id: 'download_buttonCopy',
                type: 'rect',
                rect: ['11.1%', '76.9%','248px','88px','auto', 'auto'],
                borderRadius: ["11px 11px", "11px 11px", "11px 11px", "11px 11px"],
                fill: ["rgba(55,155,220,0.00)"],
                stroke: [1,"rgba(55,155,220,1.00)","solid"]
            },
            {
                id: 'download_buttonCopy3',
                type: 'rect',
                rect: ['54.2%', '76.9%','248px','88px','auto', 'auto'],
                borderRadius: ["11px 11px", "11px 11px", "11px 11px", "11px 11px"],
                fill: ["rgba(55,155,220,0.00)"],
                stroke: [1,"rgba(55,155,220,1.00)","solid"]
            },
            {
                id: 'logo_slogan',
                type: 'image',
                rect: ['7px', '1192px','390px','80px','auto', 'auto'],
                fill: ["rgba(0,0,0,0)",'An%20element/logo_slogan.png','0px','0px']
            },
            {
                id: 'exchange_icon',
                type: 'image',
                rect: ['59.2%', '78.4%','50px','50px','auto', 'auto'],
                fill: ["rgba(0,0,0,0)",'An%20element/exchange_icon.png','0px','0px']
            },
            {
                id: 'collection_icon',
                type: 'image',
                rect: ['19.4%', '78.3%','50px','50px','auto', 'auto'],
                fill: ["rgba(0,0,0,0)",'An%20element/collection_icon.png','0px','0px']
            },
            {
                id: 'Text2',
                type: 'text',
                rect: ['27.5%', '79%','auto','auto','auto', 'auto'],
                text: "收藏",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(55,155,220,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy2',
                type: 'text',
                rect: ['11.1%', '35.2%','auto','auto','auto', 'auto'],
                text: "姓名",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(55,155,220,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy3',
                type: 'text',
                rect: ['11.1%', '41.4%','auto','auto','auto', 'auto'],
                text: "职位",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(55,155,220,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy4',
                type: 'text',
                rect: ['11.1%', '47.7%','auto','auto','auto', 'auto'],
                text: "公司",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(55,155,220,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy6',
                type: 'text',
                rect: ['11.1%', '53.9%','auto','auto','auto', 'auto'],
                text: "手机",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(55,155,220,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy5',
                type: 'text',
                rect: ['11.1%', '60.2%','auto','auto','auto', 'auto'],
                text: "邮箱",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(55,155,220,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy11',
                type: 'text',
                rect: ['23.6%', '35.2%','auto','auto','auto', 'auto'],
                text: "1姓名",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(100,100,100,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy10',
                type: 'text',
                rect: ['23.6%', '41.4%','auto','auto','auto', 'auto'],
                text: "1职位",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(100,100,100,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy9',
                type: 'text',
                rect: ['23.6%', '47.7%','auto','auto','auto', 'auto'],
                text: "1公司",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(100,100,100,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy8',
                type: 'text',
                rect: ['24%', '53.9%','auto','auto','auto', 'auto'],
                text: "1手机",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(100,100,100,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy7',
                type: 'text',
                rect: ['23.6%', '60.2%','auto','auto','auto', 'auto'],
                text: "1邮箱",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(100,100,100,1.00)", "400", "none", "normal"]
            },
            {
                id: 'Text2Copy',
                type: 'text',
                rect: ['66.4%', '79%','auto','auto','auto', 'auto'],
                text: "交换名片",
                align: "left",
                font: ['\'MS Serif\', \'New York\', serif', 32, "rgba(55,155,220,1.00)", "400", "none", "normal"]
            },
            {
                id: 'profile_background',
                type: 'image',
                rect: ['33.3%', '10.5%','240px','240px','auto', 'auto'],
                fill: ["rgba(0,0,0,0)",'An%20element/profile_background.png','0px','0px']
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
            }],
            symbolInstances: [

            ]
        },
    states: {
        "Base State": {
            "${_download_buttonCopy3}": [
                ["color", "background-color", 'rgba(55,155,220,0.00)'],
                ["style", "border-top-left-radius", [11,11], {valueTemplate:'@@0@@px @@1@@px'} ],
                ["style", "border-bottom-right-radius", [11,11], {valueTemplate:'@@0@@px @@1@@px'} ],
                ["style", "border-style", 'solid'],
                ["style", "border-top-right-radius", [11,11], {valueTemplate:'@@0@@px @@1@@px'} ],
                ["style", "width", '248px'],
                ["style", "top", '76.88%'],
                ["style", "border-bottom-left-radius", [11,11], {valueTemplate:'@@0@@px @@1@@px'} ],
                ["style", "height", '88px'],
                ["color", "border-color", 'rgba(55,155,220,1.00)'],
                ["style", "left", '54.17%'],
                ["style", "border-width", '1px']
            ],
            "${_Rectangle2}": [
                ["style", "top", '92.5%'],
                ["style", "height", '96px'],
                ["color", "background-color", 'rgba(35,35,35,1.00)'],
                ["style", "left", '0%'],
                ["style", "width", '720px']
            ],
            "${_Text2Copy}": [
                ["color", "color", 'rgba(55,155,220,1.00)'],
                ["style", "top", '78.98%'],
                ["style", "left", '66.39%'],
                ["style", "font-size", '32px']
            ],
            "${_Text2Copy9}": [
                ["style", "top", '47.66%'],
                ["color", "color", 'rgba(100,100,100,1.00)'],
                ["style", "left", '23.61%'],
                ["style", "font-size", '32px']
            ],
            "${_Text2Copy10}": [
                ["color", "color", 'rgba(100,100,100,1.00)'],
                ["style", "top", '41.41%'],
                ["style", "left", '23.61%'],
                ["style", "font-size", '32px']
            ],
            "${_Text2Copy2}": [
                ["color", "color", 'rgba(55,155,220,1.00)'],
                ["style", "top", '35.16%'],
                ["style", "left", '11.11%'],
                ["style", "font-size", '32px']
            ],
            "${_Text2Copy11}": [
                ["style", "top", '35.16%'],
                ["color", "color", 'rgba(100,100,100,1.00)'],
                ["style", "left", '23.61%'],
                ["style", "font-size", '32px']
            ],
            "${_Text2Copy8}": [
                ["style", "top", '53.91%'],
                ["color", "color", 'rgba(100,100,100,1.00)'],
                ["style", "left", '24.03%'],
                ["style", "font-size", '32px']
            ],
            "${_RoundRect}": [
                ["style", "top", '1203px'],
                ["style", "height", '60px'],
                ["color", "background-color", 'rgba(55,155,220,1)'],
                ["style", "left", '537px'],
                ["style", "width", '160px']
            ],
            "${_download_buttonCopy}": [
                ["color", "background-color", 'rgba(55,155,220,0.00)'],
                ["style", "border-top-left-radius", [11,11], {valueTemplate:'@@0@@px @@1@@px'} ],
                ["style", "border-bottom-right-radius", [11,11], {valueTemplate:'@@0@@px @@1@@px'} ],
                ["style", "border-style", 'solid'],
                ["style", "border-top-right-radius", [11,11], {valueTemplate:'@@0@@px @@1@@px'} ],
                ["style", "width", '248px'],
                ["style", "top", '76.88%'],
                ["style", "border-bottom-left-radius", [11,11], {valueTemplate:'@@0@@px @@1@@px'} ],
                ["style", "height", '88px'],
                ["color", "border-color", 'rgba(55,155,220,1.00)'],
                ["style", "border-width", '1px'],
                ["style", "left", '11.11%']
            ],
            "${_Text}": [
                ["color", "color", 'rgba(251,251,251,1)'],
                ["style", "top", '1216px'],
                ["style", "left", '590px'],
                ["style", "font-size", '28px']
            ],
            "${_exchange_icon}": [
                ["style", "left", '59.17%'],
                ["style", "top", '78.44%']
            ],
            "${_collection_icon}": [
                ["style", "left", '19.44%'],
                ["style", "top", '78.28%']
            ],
            "${_Text2}": [
                ["style", "top", '78.98%'],
                ["color", "color", 'rgba(55,155,220,1.00)'],
                ["style", "left", '27.5%'],
                ["style", "font-size", '32px']
            ],
            "${_Text2Copy7}": [
                ["color", "color", 'rgba(100,100,100,1.00)'],
                ["style", "top", '60.16%'],
                ["style", "left", '23.61%'],
                ["style", "font-size", '32px']
            ],
            "${_profile_background}": [
                ["style", "left", '33.33%'],
                ["style", "top", '10.47%']
            ],
            "${_background_image}": [
                ["style", "left", '0px'],
                ["style", "top", '0px']
            ],
            "${_Text2Copy5}": [
                ["style", "top", '60.16%'],
                ["color", "color", 'rgba(55,155,220,1.00)'],
                ["style", "left", '11.11%'],
                ["style", "font-size", '32px']
            ],
            "${_Text2Copy4}": [
                ["color", "color", 'rgba(55,155,220,1.00)'],
                ["style", "top", '47.66%'],
                ["style", "left", '11.11%'],
                ["style", "font-size", '32px']
            ],
            "${_Text2Copy3}": [
                ["style", "top", '41.41%'],
                ["color", "color", 'rgba(55,155,220,1.00)'],
                ["style", "left", '11.11%'],
                ["style", "font-size", '32px']
            ],
            "${_Stage}": [
                ["color", "background-color", 'rgba(255,255,255,1)'],
                ["style", "width", '720px'],
                ["style", "height", '1280px'],
                ["style", "overflow", 'hidden']
            ],
            "${_logo_slogan}": [
                ["style", "left", '7px'],
                ["style", "top", '1192px']
            ],
            "${_Text2Copy6}": [
                ["color", "color", 'rgba(55,155,220,1.00)'],
                ["style", "top", '53.91%'],
                ["style", "left", '11.11%'],
                ["style", "font-size", '32px']
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
})(jQuery, AdobeEdge, "EDGE-29223948");
