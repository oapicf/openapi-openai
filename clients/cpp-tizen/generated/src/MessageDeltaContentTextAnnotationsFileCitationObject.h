/*
 * MessageDeltaContentTextAnnotationsFileCitationObject.h
 *
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;file_search\&quot; tool to search files.
 */

#ifndef _MessageDeltaContentTextAnnotationsFileCitationObject_H_
#define _MessageDeltaContentTextAnnotationsFileCitationObject_H_


#include <string>
#include "MessageDeltaContentTextAnnotationsFileCitationObject_file_citation.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.
 *
 *  \ingroup Models
 *
 */

class MessageDeltaContentTextAnnotationsFileCitationObject : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageDeltaContentTextAnnotationsFileCitationObject();
	MessageDeltaContentTextAnnotationsFileCitationObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageDeltaContentTextAnnotationsFileCitationObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The index of the annotation in the text content part.
	 */
	int getIndex();

	/*! \brief Set The index of the annotation in the text content part.
	 */
	void setIndex(int  index);
	/*! \brief Get Always `file_citation`.
	 */
	std::string getType();

	/*! \brief Set Always `file_citation`.
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
	MessageDeltaContentTextAnnotationsFileCitationObject_file_citation getFileCitation();

	/*! \brief Set 
	 */
	void setFileCitation(MessageDeltaContentTextAnnotationsFileCitationObject_file_citation  file_citation);
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
	int index;
	std::string type;
	std::string text;
	MessageDeltaContentTextAnnotationsFileCitationObject_file_citation file_citation;
	int start_index;
	int end_index;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageDeltaContentTextAnnotationsFileCitationObject_H_ */
