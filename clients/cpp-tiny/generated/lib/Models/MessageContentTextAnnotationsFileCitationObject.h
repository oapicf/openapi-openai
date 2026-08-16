
/*
 * MessageContentTextAnnotationsFileCitationObject.h
 *
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;file_search\&quot; tool to search files.
 */

#ifndef TINY_CPP_CLIENT_MessageContentTextAnnotationsFileCitationObject_H_
#define TINY_CPP_CLIENT_MessageContentTextAnnotationsFileCitationObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageContentTextAnnotationsFileCitationObject_file_citation.h"

namespace Tiny {


/*! \brief A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.
 *
 *  \ingroup Models
 *
 */

class MessageContentTextAnnotationsFileCitationObject{
public:

    /*! \brief Constructor.
	 */
    MessageContentTextAnnotationsFileCitationObject();
    MessageContentTextAnnotationsFileCitationObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageContentTextAnnotationsFileCitationObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	MessageContentTextAnnotationsFileCitationObject_file_citation getFileCitation();

	/*! \brief Set 
	 */
	void setFileCitation(MessageContentTextAnnotationsFileCitationObject_file_citation  file_citation);
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
    std::string type{};
    std::string text{};
    MessageContentTextAnnotationsFileCitationObject_file_citation file_citation;
    int start_index{};
    int end_index{};
};
}

#endif /* TINY_CPP_CLIENT_MessageContentTextAnnotationsFileCitationObject_H_ */
