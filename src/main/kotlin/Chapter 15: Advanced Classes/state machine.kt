package `Chapter 15 Advanced Classes`
//ISIES
enum class DownloadState{
    idle, //Nothing has happened yet
    starting, //The download is being started
    inProgress,//Data is actively being downloaded
    error,//An error has occurred that caused the download to terminate
    success,//The data has succesfully been downloaded

}