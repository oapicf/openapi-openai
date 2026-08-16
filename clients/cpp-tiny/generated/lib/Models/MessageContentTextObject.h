
/*
 * MessageContentTextObject.h
 *
 * The text content that is part of a message.
 */

#ifndef TINY_CPP_CLIENT_MessageContentTextObject_H_
#define TINY_CPP_CLIENT_MessageContentTextObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageContentTextObject_text.h"

namespace Tiny {


/*! \brief The text content that is part of a message.
 *
 *  \ingroup Models
 *
 */

class MessageContentTextObject{
public:

    /*! \brief Constructor.
	 */
    MessageContentTextObject();
    MessageContentTextObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageContentTextObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Always `text`.
	 */
	std::string getType();

	/*! \brief Set Always `text`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	MessageContentTextObject_text getText();

	/*! \brief Set 
	 */
	void setText(MessageContentTextObject_text  text);


    private:
    std::string type{};
    MessageContentTextObject_text text;
};
}

#endif /* TINY_CPP_CLIENT_MessageContentTextObject_H_ */
