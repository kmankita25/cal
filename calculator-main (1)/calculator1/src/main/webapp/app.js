let ankitacal=document.getElementById("ankitacal");
function cal(num)
{
ankitacal.value += num;
}
function calculate()
{
try
{
ankitacal.value=eval(ankitacal.value);
}
catch(err)
{
alert("invalid:please write valid input");
}
}
function clear1()
{
ankitacal.value="";
}
function del()
{
ankitacal.value=ankitacal.value.slice(0,-1);
}
