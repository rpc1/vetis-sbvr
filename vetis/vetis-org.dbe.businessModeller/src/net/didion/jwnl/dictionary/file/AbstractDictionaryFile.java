/**
 * Java WordNet Library (JWNL)
 * See the documentation for copyright information.
 */
package net.didion.jwnl.dictionary.file;

import net.didion.jwnl.data.POS;

import java.io.File;
import java.io.IOException;

import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.dbe.businessModeller.utils.ResourceProvider;

/**
 * Abstract implementation of <code>DictionaryFile</code>. This class
 * should be implemented for each file naming scheme used. It is assumed that each
 * file will be associated with both a POS and a file type (e.g. in the windows
 * naming scheme, the verb index file is called "verb.idx").
 */
public abstract class AbstractDictionaryFile implements DictionaryFile {
	private POS _pos;
	/**
	 * The type of the file. For example, the default implementation defines the
	 * types INDEX, DATA, and EXCEPTION.
	 */
	private DictionaryFileType _fileType;
	private File _file;

	public AbstractDictionaryFile() {}

	protected AbstractDictionaryFile(String path, POS pos, DictionaryFileType fileType) {
		_pos = pos;
		_fileType = fileType;
		// Modified for integratoin with SBeaVeR editor (Pierpaolo Cira)
		// _file = new File(path, makeFilename());
		_file = ResourceProvider.getFile(path, makeFilename());
	}

	/** Build a filename from the part-of-speech and the file type. */
	protected abstract String makeFilename();

	/** Open the file at path <code>path</code> */
	protected abstract void openFile(File file) throws IOException;

	/** The POS associated with this file.*/
	public POS getPOS() {
		return _pos;
	}

	public File getFile() {
		return _file;
	}

	/** The file type associated with this file.*/
	public DictionaryFileType getFileType() {
		return _fileType;
	}

	/** Open the file. */
	public void	open() throws IOException {
		if (!isOpen())
			openFile(_file);
	}
}