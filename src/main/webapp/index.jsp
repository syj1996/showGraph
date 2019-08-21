<html>
<%@page pageEncoding="UTF-8" %>
<%@page contentType="text/html; UTF-8" %>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="lib/bootstrap.css" rel="stylesheet">
</head>
<script src="lib/sigma.js-1.2.1/src/sigma.core.js"></script>
<script src="lib/sigma.js-1.2.1/src/conrad.js"></script>
<script src="lib/sigma.js-1.2.1/src/utils/sigma.utils.js"></script>
<script src="lib/sigma.js-1.2.1/src/utils/sigma.polyfills.js"></script>
<script src="lib/sigma.js-1.2.1/src/sigma.settings.js"></script>
<script src="lib/sigma.js-1.2.1/src/classes/sigma.classes.dispatcher.js"></script>
<script src="lib/sigma.js-1.2.1/src/classes/sigma.classes.configurable.js"></script>
<script src="lib/sigma.js-1.2.1/src/classes/sigma.classes.graph.js"></script>
<script src="lib/sigma.js-1.2.1/src/classes/sigma.classes.camera.js"></script>
<script src="lib/sigma.js-1.2.1/src/classes/sigma.classes.quad.js"></script>
<script src="lib/sigma.js-1.2.1/src/classes/sigma.classes.edgequad.js"></script>
<script src="lib/sigma.js-1.2.1/src/captors/sigma.captors.mouse.js"></script>
<script src="lib/sigma.js-1.2.1/src/captors/sigma.captors.touch.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/sigma.renderers.canvas.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/sigma.renderers.webgl.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/sigma.renderers.svg.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/sigma.renderers.def.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/webgl/sigma.webgl.nodes.def.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/webgl/sigma.webgl.nodes.fast.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/webgl/sigma.webgl.edges.def.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/webgl/sigma.webgl.edges.fast.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/webgl/sigma.webgl.edges.arrow.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/canvas/sigma.canvas.labels.def.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/canvas/sigma.canvas.hovers.def.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/canvas/sigma.canvas.nodes.def.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/canvas/sigma.canvas.edges.def.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/canvas/sigma.canvas.edges.curve.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/canvas/sigma.canvas.edges.arrow.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/canvas/sigma.canvas.edges.curvedArrow.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/canvas/sigma.canvas.edgehovers.def.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/canvas/sigma.canvas.edgehovers.curve.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/canvas/sigma.canvas.edgehovers.arrow.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/canvas/sigma.canvas.edgehovers.curvedArrow.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/canvas/sigma.canvas.extremities.def.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/svg/sigma.svg.utils.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/svg/sigma.svg.nodes.def.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/svg/sigma.svg.edges.def.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/svg/sigma.svg.edges.curve.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/svg/sigma.svg.labels.def.js"></script>
<script src="lib/sigma.js-1.2.1/src/renderers/svg/sigma.svg.hovers.def.js"></script>
<script src="lib/sigma.js-1.2.1/src/middlewares/sigma.middlewares.rescale.js"></script>
<script src="lib/sigma.js-1.2.1/src/middlewares/sigma.middlewares.copy.js"></script>
<script src="lib/sigma.js-1.2.1/src/misc/sigma.misc.animation.js"></script>
<script src="lib/sigma.js-1.2.1/src/misc/sigma.misc.bindEvents.js"></script>
<script src="lib/sigma.js-1.2.1/src/misc/sigma.misc.bindDOMEvents.js"></script>
<script src="lib/sigma.js-1.2.1/src/misc/sigma.misc.drawHovers.js"></script>
<!-- END SIGMA IMPORTS -->
<script src="lib/sigma.js-1.2.1/plugins/sigma.renderers.customEdgeShapes/sigma.canvas.edges.dashed.js"></script>
<script src="lib/sigma.js-1.2.1/plugins/sigma.renderers.customEdgeShapes/sigma.canvas.edges.dotted.js"></script>
<script src="lib/sigma.js-1.2.1/plugins/sigma.renderers.customEdgeShapes/sigma.canvas.edges.parallel.js"></script>
<script src="lib/sigma.js-1.2.1/plugins/sigma.renderers.customEdgeShapes/sigma.canvas.edges.tapered.js"></script>
<script src="lib/sigma.js-1.2.1/plugins/sigma.renderers.customEdgeShapes/sigma.canvas.edgehovers.dashed.js"></script>
<script src="lib/sigma.js-1.2.1/plugins/sigma.renderers.customEdgeShapes/sigma.canvas.edgehovers.dotted.js"></script>
<script src="lib/sigma.js-1.2.1/plugins/sigma.renderers.customEdgeShapes/sigma.canvas.edgehovers.parallel.js"></script>
<script src="lib/sigma.js-1.2.1/plugins/sigma.renderers.customEdgeShapes/sigma.canvas.edgehovers.tapered.js"></script>
<script src="lib/jQuery.js"></script>
<script src="lib/bootstrap.js"></script>
<script type="text/javascript" src="Js/generateTable.js" async="async"></script>
<body>
<style>
    html { overflow-x: hidden; overflow-y: true; }
    #Container{
        display:flex;
        flex-direction: row;
        justify-content:center;
        width: 100%;
        height: 100%;
        margin-top:30px;
        margin-right:50px;
        margin-left: 50px;
        margin-bottom: 30px;
    }
    #container1{
         width:70%;
         height:100%;
         position:relative;
     }
    #container2{
        width:800px;
        height:100%;
        display: flex;
        flex-direction: column;
        align-items: center;
    }
    #graph-container {
        top: 0;
        bottom: 0;
        left: 0;
        right: 0;
        position: absolute;
    }
    #control{
        width:100%;
        height:20%;
        display: flex;
        justify-content:center;
        margin-bottom: 50px;
    }
    #table{
        width:100%;
        height:80%;
    }
    #title{
        height: 40px;
        font-size: 30pt;
        font-family: 微软雅黑;
        font-weight: bold;
    }
    .btn{
        width:30%;
        height:70%;
        margin:20px;
        color:white;
        font-family: 微软雅黑;
        font-size:30pt;
        font-weight: bolder;
    }
    #start{
        background-color: #ff9d42;
    }
    #pause{
        background-color: #1cff22;
    }
    #end{
        background-color: #4993ff;
    }

</style>
<div id="Container">

    <div id="container1">
        <div id="graph-container"></div>
    </div>
    <div id="container2">
        <div id="control">
            <button class="btn" id="start">开始</button>
            <button class="btn" id="pause">停止</button>
            <button class="btn" id="end">结束</button>
        </div>
        <div id="table">
            <p id="title"></p>
            <table class="table table-striped table-dark table-hover" id="table1">
            </table>
        </div>
    </div>
</div>
<script>
    var iplist=[];
    var edgelist=[];
    s = new sigma({
        graph: null,
        renderer: {
            container: document.getElementById('graph-container'),
            type: 'canvas'
        },
        settings: {
            doubleClickEnabled: false,
            minEdgeSize: 0.5,
            maxEdgeSize: 4,
            enableEdgeHovering: true,
            edgeHoverColor: 'edge',
            nodeHoverColor: 'node',
            defaultEdgeHoverColor: '#000',
            edgeHoverSizeRatio: 1,
            edgeHoverExtremities: true,
        }
    });
    var action;
    var pauseFlag=true;
    var startGraph=document.getElementById("start");
    var pauseGraph=document.getElementById("pause");
    var endGraph=document.getElementById("end");
    var number=10,interval=10;
    var getTOServlet=function(){
        $.getJSON("httpServlet",{action:"start",number:number.toString(),interval:interval.toString()},function(data){
            if(data!=null)
                getGraph(data);
        });
        number=number+interval;
    };
    var getGraph=function(data){
        for(var i in data) {
            var message=data[i];
            var obj={SIP:data[i].SIP,DIP:data[i].DIP}
            if(iplist.indexOf(message.SIP) <= -1){
                iplist.push(message.SIP);
                s.graph.addNode({
                    id: message.SIP,          //点的id用于点的标识
                    label: message.SIP,   //点上的标签文本
                    x: Math.random(),      //点的位置x，y
                    y: Math.random(),
                    size: 2,    //点的大小
                    color: '#666',
                    hover_color: '#000'             //点的颜色
                });
            }
            if(iplist.indexOf(message.DIP)<=-1){
                iplist.push(message.DIP);
                s.graph.addNode({
                    id: message.DIP,          //点的id用于点的标识
                    label: message.DIP,   //点上的标签文本
                    x: Math.random(),      //点的位置x，y
                    y: Math.random(),
                    size: 2,    //点的大小
                    color: '#666',
                    hover_color: '#000'             //点的颜色
                });
            }
            if(edgelist.length==0){
                edgelist.push(obj);
                s.graph.addEdge({
                    id: message.Number.toString(),
                    source: obj.SIP,  //边的起点
                    target: obj.DIP,   //边的终点
                    size: 1,                     //边的大小
                    color: '#ccc',
                    hover_color: '#000'                              //边的颜色
                });
            }
            var flag=false;
            for(var j in edgelist) {
                if ((edgelist[j].SIP == obj.SIP && edgelist[j].DIP == obj.DIP)) {
                    flag = true;
                }
            }
            if(flag ==false){
                    edgelist.push(obj);
                    s.graph.addEdge({
                    id: message.Number.toString(),
                    source: obj.SIP,  //边的起点
                    target: obj.DIP,   //边的终点
                    size: 2,                     //边的大小
                    color: '#ccc',
                    hover_color: '#000'          //边的颜色
                });
                }
            }
           s.refresh();
    };
    var timeStart=function(){
        s.graph.clear();
        s.refresh();
        clearInterval(action);
        pauseFlag=true;
        pauseGraph.innerHTML="暂停";
        action = setInterval(getTOServlet,2000);
    };
    var timePause=function(){
        if(pauseFlag)
        {
            clearInterval(action);
            pauseFlag=false;
            pauseGraph.innerHTML="继续";
        }
        else {
            action = setInterval(getTOServlet,2000);
            pauseFlag=true;
            pauseGraph.innerHTML="暂停";
        }
    };
    var timeEnd=function(){
        clearInterval(action);
        pauseFlag=true;
        pauseGraph.innerHTML="暂停";
        number=10;
    };
    startGraph.onclick=function(){
        iplist=[];
        edgelist=[];
        number=10;
        timeStart();
    };
    pauseGraph.onclick = function(){
        timePause();
    };
    endGraph.onclick=function(){
        timeEnd();
    };


    // Bind the events:
    s.bind('clickNode', function(e) {
        var nodeInfo= e.data.node;
        generateNodeTable(nodeInfo);
    });
    s.bind('clickEdge', function(e) {
        var edgeInfo= e.data.edge;
        generateEdgeTable(edgeInfo);
    });
// 设置变量参数

</script>
</body>
</html>
