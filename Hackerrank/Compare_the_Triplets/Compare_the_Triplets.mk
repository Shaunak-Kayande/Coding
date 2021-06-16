##
## Auto Generated makefile by CodeLite IDE
## any manual changes will be erased      
##
## Debug
ProjectName            :=Compare_the_Triplets
ConfigurationName      :=Debug
WorkspaceConfiguration := $(ConfigurationName)
WorkspacePath          :=C:/Users/Shaunak/Documents/C++/Hackerrank
ProjectPath            :=C:/Users/Shaunak/Documents/C++/Hackerrank/Compare_the_Triplets
IntermediateDirectory  :=../build-$(ConfigurationName)/Compare_the_Triplets
OutDir                 :=../build-$(ConfigurationName)/Compare_the_Triplets
CurrentFileName        :=
CurrentFilePath        :=
CurrentFileFullPath    :=
User                   :=Shaunak
Date                   :=21/10/2020
CodeLitePath           :="C:/Program Files/CodeLite"
LinkerName             :=C:/MinGW/bin/g++.exe
SharedObjectLinkerName :=C:/MinGW/bin/g++.exe -shared -fPIC
ObjectSuffix           :=.o
DependSuffix           :=.o.d
PreprocessSuffix       :=.i
DebugSwitch            :=-g 
IncludeSwitch          :=-I
LibrarySwitch          :=-l
OutputSwitch           :=-o 
LibraryPathSwitch      :=-L
PreprocessorSwitch     :=-D
SourceSwitch           :=-c 
OutputFile             :=..\build-$(ConfigurationName)\bin\$(ProjectName)
Preprocessors          :=
ObjectSwitch           :=-o 
ArchiveOutputSwitch    := 
PreprocessOnlySwitch   :=-E
ObjectsFileList        :=$(IntermediateDirectory)/ObjectsList.txt
PCHCompileFlags        :=
RcCmpOptions           := 
RcCompilerName         :=C:/MinGW/bin/windres.exe
LinkOptions            :=  
IncludePath            :=  $(IncludeSwitch). $(IncludeSwitch). 
IncludePCH             := 
RcIncludePath          := 
Libs                   := 
ArLibs                 :=  
LibPath                := $(LibraryPathSwitch). 

##
## Common variables
## AR, CXX, CC, AS, CXXFLAGS and CFLAGS can be overriden using an environment variables
##
AR       := C:/MinGW/bin/ar.exe rcu
CXX      := C:/MinGW/bin/g++.exe
CC       := C:/MinGW/bin/gcc.exe
CXXFLAGS :=  -g -O0 -Wall $(Preprocessors)
CFLAGS   :=  -g -O0 -Wall $(Preprocessors)
ASFLAGS  := 
AS       := C:/MinGW/bin/as.exe


##
## User defined environment variables
##
CodeLiteDir:=C:\Program Files\CodeLite
Objects0=../build-$(ConfigurationName)/Compare_the_Triplets/main.c$(ObjectSuffix) 



Objects=$(Objects0) 

##
## Main Build Targets 
##
.PHONY: all clean PreBuild PrePreBuild PostBuild MakeIntermediateDirs
all: MakeIntermediateDirs $(OutputFile)

$(OutputFile): ../build-$(ConfigurationName)/Compare_the_Triplets/.d $(Objects) 
	@if not exist "..\build-$(ConfigurationName)\Compare_the_Triplets" mkdir "..\build-$(ConfigurationName)\Compare_the_Triplets"
	@echo "" > $(IntermediateDirectory)/.d
	@echo $(Objects0)  > $(ObjectsFileList)
	$(LinkerName) $(OutputSwitch)$(OutputFile) @$(ObjectsFileList) $(LibPath) $(Libs) $(LinkOptions)

MakeIntermediateDirs:
	@if not exist "..\build-$(ConfigurationName)\Compare_the_Triplets" mkdir "..\build-$(ConfigurationName)\Compare_the_Triplets"
	@if not exist ""..\build-$(ConfigurationName)\bin"" mkdir ""..\build-$(ConfigurationName)\bin""

../build-$(ConfigurationName)/Compare_the_Triplets/.d:
	@if not exist "..\build-$(ConfigurationName)\Compare_the_Triplets" mkdir "..\build-$(ConfigurationName)\Compare_the_Triplets"

PreBuild:


##
## Objects
##
../build-$(ConfigurationName)/Compare_the_Triplets/main.c$(ObjectSuffix): main.c ../build-$(ConfigurationName)/Compare_the_Triplets/main.c$(DependSuffix)
	$(CC) $(SourceSwitch) "C:/Users/Shaunak/Documents/C++/Hackerrank/Compare_the_Triplets/main.c" $(CFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/main.c$(ObjectSuffix) $(IncludePath)
../build-$(ConfigurationName)/Compare_the_Triplets/main.c$(DependSuffix): main.c
	@$(CC) $(CFLAGS) $(IncludePath) -MG -MP -MT../build-$(ConfigurationName)/Compare_the_Triplets/main.c$(ObjectSuffix) -MF../build-$(ConfigurationName)/Compare_the_Triplets/main.c$(DependSuffix) -MM main.c

../build-$(ConfigurationName)/Compare_the_Triplets/main.c$(PreprocessSuffix): main.c
	$(CC) $(CFLAGS) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) ../build-$(ConfigurationName)/Compare_the_Triplets/main.c$(PreprocessSuffix) main.c


-include ../build-$(ConfigurationName)/Compare_the_Triplets//*$(DependSuffix)
##
## Clean
##
clean:
	$(RM) -r $(IntermediateDirectory)


