
/*
 * MessageRequestContentTextObject.h
 *
 * The text content that is part of a message.
 */

#ifndef TINY_CPP_CLIENT_MessageRequestContentTextObject_H_
#define TINY_CPP_CLIENT_MessageRequestContentTextObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The text content that is part of a message.
 *
 *  \ingroup Models
 *
 */

class MessageRequestContentTextObject{
public:

    /*! \brief Constructor.
	 */
    MessageRequestContentTextObject();
    MessageRequestContentTextObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageRequestContentTextObject();


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
	/*! \brief Get Text content to be sent to the model
	 */
	std::string getText();

	/*! \brief Set Text content to be sent to the model
	 */
	void setText(std::string  text);


    private:
    std::string type{};
    std::string text{};
};
}

#endif /* TINY_CPP_CLIENT_MessageRequestContentTextObject_H_ */
