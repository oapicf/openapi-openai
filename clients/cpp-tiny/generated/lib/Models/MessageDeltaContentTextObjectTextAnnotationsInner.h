
/*
 * MessageDeltaContentTextObject_text_annotations_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MessageDeltaContentTextObject_text_annotations_inner_H_
#define TINY_CPP_CLIENT_MessageDeltaContentTextObject_text_annotations_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageDeltaContentTextAnnotationsFileCitationObject.h"
#include "MessageDeltaContentTextAnnotationsFileCitationObject_file_citation.h"
#include "MessageDeltaContentTextAnnotationsFilePathObject.h"
#include "MessageDeltaContentTextAnnotationsFilePathObject_file_path.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MessageDeltaContentTextObject_text_annotations_inner{
public:

    /*! \brief Constructor.
	 */
    MessageDeltaContentTextObject_text_annotations_inner();
    MessageDeltaContentTextObject_text_annotations_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageDeltaContentTextObject_text_annotations_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    int index{};
    std::string type{};
    std::string text{};
    MessageDeltaContentTextAnnotationsFileCitationObject_file_citation file_citation;
    int start_index{};
    int end_index{};
    MessageDeltaContentTextAnnotationsFilePathObject_file_path file_path;
};
}

#endif /* TINY_CPP_CLIENT_MessageDeltaContentTextObject_text_annotations_inner_H_ */
