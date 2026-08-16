
/*
 * MessageDeltaContentRefusalObject.h
 *
 * The refusal content that is part of a message.
 */

#ifndef TINY_CPP_CLIENT_MessageDeltaContentRefusalObject_H_
#define TINY_CPP_CLIENT_MessageDeltaContentRefusalObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The refusal content that is part of a message.
 *
 *  \ingroup Models
 *
 */

class MessageDeltaContentRefusalObject{
public:

    /*! \brief Constructor.
	 */
    MessageDeltaContentRefusalObject();
    MessageDeltaContentRefusalObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageDeltaContentRefusalObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The index of the refusal part in the message.
	 */
	int getIndex();

	/*! \brief Set The index of the refusal part in the message.
	 */
	void setIndex(int  index);
	/*! \brief Get Always `refusal`.
	 */
	std::string getType();

	/*! \brief Set Always `refusal`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	std::string getRefusal();

	/*! \brief Set 
	 */
	void setRefusal(std::string  refusal);


    private:
    int index{};
    std::string type{};
    std::string refusal{};
};
}

#endif /* TINY_CPP_CLIENT_MessageDeltaContentRefusalObject_H_ */
