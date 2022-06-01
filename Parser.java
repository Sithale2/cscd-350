package cs350s22.component.ui.parser;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

import cs350s22.support.Identifier;

public class Parser
{

	public ParserTokenManager token_source;
	public Token token;
	public Token jj_nt;
	
	public Parser(A_ParserHelper parserHelper, String commandText)
	{
		
	}
	
	public Parser(InputStream stream)
	{
		
	}
	
	public Parser(InputStream stream, String encoding)
	{
		
	}
	
	public Parser(Reader stream)
	{
		
	}
	
	public Parser(ParserTokenManager tm)
	{
		
	}
	
	public final void disable_tracing()
	{
		
	}
	
	public final void enable_tracing()
	{
		
	}
	
	public final String filename() throws ParseException
	{
		return null;
    }
	
	public ParseException generateParseException()
	{
		return null;
	}
	
	public final Token getNextToken()
	{
		return null;
	}
	
	public final Token getToken(int index)
	{
		return null;
	}
	
	public final List<Identifier> groups() throws ParseException
	{
		return null;
	}
	
	public final Identifier identifier() throws ParseException
	{
		return null;
	}
	
	public final List<Identifier> idList() throws ParseException
	{
		return null;
	}
	
	public final List<Identifier> ids() throws ParseException
	{
		return null;
	}
	
	public final int integer() throws ParseException
	{
		return 0;
	}
	
	public final double number() throws ParseException
	{
		return 0;
	}
	
	public final void parse() throws ParseException, IOException
	{
		
	}
	
	public final double real() throws ParseException
	{
		return 0;
	}
	
	public void ReInit(InputStream stream)
	{
		
	}
	
	public void ReInit(InputStream stream, String encoding)
	{
		
	}

	public void ReInit(Reader stream)
	{
		
	}
	
	public void ReInit(ParserTokenManager tm)
	{
		
	}
}
