# Calculator

Part-1 (code is @branch "Part1")

Two rest API end points with Spring with a Maven Based SpringBoot project .
The API runs on port 9091 on http.

API 1- SUM
POST http://{{service-ip}}/api/add
{
            "x":"100",
            "y":"50"
}

returns 200 OK with
{
            "result":"150"
}

------------------------------------------
API 2- DIFF 
POST http://{{service-ip}}/api/diff
{
            "x":"100",
            "y":"50"
}

returns 200 OK with

{
             "result":"50"
}

------
