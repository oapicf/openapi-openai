
/*
 * MessageContentTextObject_text.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MessageContentTextObject_text_H_
#define TINY_CPP_CLIENT_MessageContentTextObject_text_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageContentTextObject_text_annotations_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MessageContentTextObject_text{
public:

    /*! \brief Constructor.
	 */
    MessageContentTextObject_text();
    MessageContentTextObject_text(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageContentTextObject_text();


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
	std::list<MessageContentTextObject_text_annotations_inner> getAnnotations();

	/*! \brief Set 
	 */
	void setAnnotations(std::list <MessageContentTextObject_text_annotations_inner> annotations);


    private:
    std::string value{};
    std::list<MessageContentTextObject_text_annotations_inner> annotations;
};
}

#endif /* TINY_CPP_CLIENT_MessageContentTextObject_text_H_ */
