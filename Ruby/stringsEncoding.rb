def transcode(string)
	string.encoding
	string.force_encoding(Encoding::UTF_8)
end
