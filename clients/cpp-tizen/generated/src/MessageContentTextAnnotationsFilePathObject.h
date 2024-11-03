/*
 * MessageContentTextAnnotationsFilePathObject.h
 *
 * A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
 */

#ifndef _MessageContentTextAnnotationsFilePathObject_H_
#define _MessageContentTextAnnotationsFilePathObject_H_


#include <string>
#include "MessageContentTextAnnotationsFilePathObject_file_path.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 *
 *  \ingroup Models
 *
 */

class MessageContentTextAnnotationsFilePathObject : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageContentTextAnnotationsFilePathObject();
	MessageContentTextAnnotationsFilePathObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageContentTextAnnotationsFilePathObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Always `file_path`.
	 */
	std::string getType();

	/*! \brief Set Always `file_path`.
	 */
	void setType(std::string  type);
	/*! \brief Get The text in the message content that needs to be replaced.
	 */
	std::string getText();

	/*! \brief Set The text in the message content that needs to be replaced.
	 */
	void setText(std::string  text);
	/*! \brief Get 
	 */
	MessageContentTextAnnotationsFilePathObject_file_path getFilePath();

	/*! \brief Set 
	 */
	void setFilePath(MessageContentTextAnnotationsFilePathObject_file_path  file_path);
	/*! \brief Get 
	 */
	int getStartIndex();

	/*! \brief Set 
	 */
	void setStartIndex(int  start_index);
	/*! \brief Get 
	 */
	int getEndIndex();

	/*! \brief Set 
	 */
	void setEndIndex(int  end_index);

private:
	std::string type;
	std::string text;
	MessageContentTextAnnotationsFilePathObject_file_path file_path;
	int start_index;
	int end_index;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageContentTextAnnotationsFilePathObject_H_ */
