/*
 * MessageDeltaContentTextObject_text_annotations_inner.h
 *
 * 
 */

#ifndef _MessageDeltaContentTextObject_text_annotations_inner_H_
#define _MessageDeltaContentTextObject_text_annotations_inner_H_


#include <string>
#include "MessageDeltaContentTextAnnotationsFileCitationObject.h"
#include "MessageDeltaContentTextAnnotationsFileCitationObject_file_citation.h"
#include "MessageDeltaContentTextAnnotationsFilePathObject.h"
#include "MessageDeltaContentTextAnnotationsFilePathObject_file_path.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MessageDeltaContentTextObject_text_annotations_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageDeltaContentTextObject_text_annotations_inner();
	MessageDeltaContentTextObject_text_annotations_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageDeltaContentTextObject_text_annotations_inner();

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
	/*! \brief Get 
	 */
	MessageDeltaContentTextAnnotationsFilePathObject_file_path getFilePath();

	/*! \brief Set 
	 */
	void setFilePath(MessageDeltaContentTextAnnotationsFilePathObject_file_path  file_path);

private:
	int index;
	std::string type;
	std::string text;
	MessageDeltaContentTextAnnotationsFileCitationObject_file_citation file_citation;
	int start_index;
	int end_index;
	MessageDeltaContentTextAnnotationsFilePathObject_file_path file_path;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageDeltaContentTextObject_text_annotations_inner_H_ */
