package zemoso_training;

//represents interface segregation principle
interface ExamCorrection
{
	public void correctPapers();
	public void assignMarks();
}
//represents interface segregation principle
interface Exams
{
	public void writeExam();
	public void viewMarks();
}