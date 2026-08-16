
/*
 * MessageDeltaContentTextObject.h
 *
 * The text content that is part of a message.
 */

#ifndef TINY_CPP_CLIENT_MessageDeltaContentTextObject_H_
#define TINY_CPP_CLIENT_MessageDeltaContentTextObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageDeltaContentTextObject_text.h"

namespace Tiny {


/*! \brief The text content that is part of a message.
 *
 *  \ingroup Models
 *
 */

class MessageDeltaContentTextObject{
public:

    /*! \brief Constructor.
	 */
    MessageDeltaContentTextObject();
    MessageDeltaContentTextObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageDeltaContentTextObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The index of the content part in the message.
	 */
	int getIndex();

	/*! \brief Set The index of the content part in the message.
	 */
	void setIndex(int  index);
	/*! \brief Get Always `text`.
	 */
	std::string getType();

	/*! \brief Set Always `text`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	MessageDeltaContentTextObject_text getText();

	/*! \brief Set 
	 */
	void setText(MessageDeltaContentTextObject_text  text);


    private:
    int index{};
    std::string type{};
    MessageDeltaContentTextObject_text text;
};
}

#endif /* TINY_CPP_CLIENT_MessageDeltaContentTextObject_H_ */
