/**
 * Created by Alicia on 2017/5/7.
 */
function breadTrail() {
    var items = location.pathname.substr(1).split("/");
    var breadcrumbTrail ="<a class='current'>��ҳ</a>";
    if(items[3]=="Admin?.action") {
        breadcrumbTrail += "<a class='current'>�γ�һ��</a>";
        if(items[4]=="AccChange?.action") {
            breadcrumbTrail += "<a class='current'>修改账户</a>";
        }
        if(items[4]=="AccCreate.html") {
            breadcrumbTrail += "<a class='current'>创建账户</a>";
        }
        if(items[4]=="AccDel.html") {
            breadcrumbTrail += "<a class='current'>删除账户</a>";
        }
    }
    if(items[3]=="Teacher") {
        breadcrumbTrail += "<a class='current'>我的课程</a>";
        if (items[4] == "CourChange.html") {
            breadcrumbTrail += "<a class='current'>修改课程</a>";
        }
        if (items[4] == "CourCreate.html") {
            breadcrumbTrail += "<a class='current'>创建课程</a>";
        }
        if (items[4] == "CourDel.html") {
            breadcrumbTrail += "<a class='current'>删除课程</a>";
        }
    }
    if(items[4]=="MyAcc.html") {
        breadcrumbTrail += "<a class='current'>我的账户</a>";
    }
    document.getElementById("breadcrumb").innerHTML = breadcrumbTrail;

}
window.onload(breadTrail());