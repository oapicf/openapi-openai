
/*
 * ResponseFormatJsonObject.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ResponseFormatJsonObject_H_
#define TINY_CPP_CLIENT_ResponseFormatJsonObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ResponseFormatJsonObject{
public:

    /*! \brief Constructor.
	 */
    ResponseFormatJsonObject();
    ResponseFormatJsonObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ResponseFormatJsonObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of response format being defined: `json_object`
	 */
	std::string getType();

	/*! \brief Set The type of response format being defined: `json_object`
	 */
	void setType(std::string  type);


    private:
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_ResponseFormatJsonObject_H_ */
