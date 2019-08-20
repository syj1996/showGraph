var generateNodeTable=function (nodeInfo) {
    var ip=nodeInfo.id;
    $.getJSON("nodeTable",{action:"search",nodeIp:ip},function(data){
        if(data!=null)
            nodeTable(data,ip);
    },"json");
};
var generateEdgeTable=function(edgeInfo){
    var SIP=edgeInfo.source;
    var DIP=edgeInfo.target;
    $.getJSON("edgeTable",{action:"search",SIP:SIP,DIP:DIP},function(data){
        edgeTable(data);
    },"json");
};
var nodeTable=function(data,ip){
    $("#table1").empty();
    var table=document.getElementById("table1");
    var thead=document.createElement("thead");
    var tbody=document.createElement("tbody");
    var tr1=document.createElement("tr");
    var th0=document.createElement("th");
    var th1=document.createElement("th");
    var th2=document.createElement("th");
    var th3=document.createElement("th");
    th0.setAttribute("scope","col");
    th1.setAttribute("scope","col");
    th2.setAttribute("scope","col");
    th3.setAttribute("scope","col");
    th0.innerText="order";th1.innerText="Number";
    th2.innerText="DIP";th3.innerText="Time";
    $('#title').text(ip+"的报文");
    tr1.appendChild(th0);
    tr1.appendChild(th1);
    tr1.appendChild(th2);
    tr1.appendChild(th3);
    thead.appendChild(tr1);
    for(var i in data){
        var thr=document.createElement("tr");
        var rth0=document.createElement("th");
        var rth1=document.createElement("td");
        var rth2=document.createElement("td");
        var rth3=document.createElement("td");
        rth0.setAttribute("scope","row");
        rth0.innerText=i.toString();rth1.innerText=data[i].Number;rth2.innerText=data[i].DIP;rth3.innerText=data[i].Time;
        thr.appendChild(rth0);
        thr.appendChild(rth1);
        thr.appendChild(rth2);
        thr.appendChild(rth3);
        tbody.appendChild(thr);
    }
    table.appendChild(thead);
    table.appendChild(tbody);
};
var edgeTable=function(data){
    $("#table1").empty();
    var table=document.getElementById("table1");
    var thead=document.createElement("thead");
    var tbody=document.createElement("tbody");
    var tr1=document.createElement("tr");
    var th0=document.createElement("th");
    var th1=document.createElement("th");
    var th2=document.createElement("th");
    var th3=document.createElement("th");
    var th4 = document.createElement("th");
    th0.setAttribute("scope","col");
    th1.setAttribute("scope","col");
    th2.setAttribute("scope","col");
    th3.setAttribute("scope","col");
    th4.setAttribute("scope", "col");
    th0.innerText="order";th1.innerText="Number";
    th2.innerText = "SIP"; th3.innerText = "DIP";th4.innerText="Time";
    $('#title').text(data[0].SIP+"与"+data[0].DIP+"的报文");
    tr1.appendChild(th0);
    tr1.appendChild(th1);
    tr1.appendChild(th2);
    tr1.appendChild(th3);
    tr1.appendChild(th4);
    thead.appendChild(tr1);
    for(var i in data){
        var thr=document.createElement("tr");
        var rth0=document.createElement("th");
        var rth1=document.createElement("td");
        var rth2=document.createElement("td");
        var rth3=document.createElement("td");
        var rth4 = document.createElement("td");
        rth0.setAttribute("scope","row");
        rth0.innerText=i.toString();
        rth1.innerText=data[i].Number;
        rth2.innerText=data[i].SIP;
        rth3.innerText = data[i].DIP;
        rth4.innerText=data[i].Time;
        thr.appendChild(rth0);
        thr.appendChild(rth1);
        thr.appendChild(rth2);
        thr.appendChild(rth3);
        thr.appendChild(rth4);
        tbody.appendChild(thr);
    }
    table.appendChild(thead);
    table.appendChild(tbody);
};


