package compress.lzma;

public interface ICodeProgress
{
	public void SetProgress(long inSize, long outSize);
}
