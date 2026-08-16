
/*
 * MessageDeltaContentTextObject_text.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MessageDeltaContentTextObject_text_H_
#define TINY_CPP_CLIENT_MessageDeltaContentTextObject_text_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageDeltaContentTextObject_text_annotations_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MessageDeltaContentTextObject_text{
public:

    /*! \brief Constructor.
	 */
    MessageDeltaContentTextObject_text();
    MessageDeltaContentTextObject_text(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageDeltaContentTextObject_text();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The data that makes up the text.
	 */
	std::string getValue();

	/*! \brief Set The data that makes up the text.
	 */
	void setValue(std::string  value);
	/*! \brief Get 
	 */
	std::list<MessageDeltaContentTextObject_text_annotations_inner> getAnnotations();

	/*! \brief Set 
	 */
	void setAnnotations(std::list <MessageDeltaContentTextObject_text_annotations_inner> annotations);


    private:
    std::string value{};
    std::list<MessageDeltaContentTextObject_text_annotations_inner> annotations;
};
}

#endif /* TINY_CPP_CLIENT_MessageDeltaContentTextObject_text_H_ */
