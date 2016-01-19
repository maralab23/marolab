/**
 * MaroLab Javascript Common Lib.
 */

/**
 * String Null Check Validation Function
 */
function isDefined(str)
{
    var isResult = false;
    str_temp = str + "";
    str_temp = str_temp.replace(" ", "");
    if(str_temp != "undefined" && str_temp != "" && str_temp != "null")
    {
        isResult = true;
    }
     
    return isResult;
}