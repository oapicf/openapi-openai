
/*
 * ResponseFormatText.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ResponseFormatText_H_
#define TINY_CPP_CLIENT_ResponseFormatText_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ResponseFormatText{
public:

    /*! \brief Constructor.
	 */
    ResponseFormatText();
    ResponseFormatText(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ResponseFormatText();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of response format being defined: `text`
	 */
	std::string getType();

	/*! \brief Set The type of response format being defined: `text`
	 */
	void setType(std::string  type);


    private:
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_ResponseFormatText_H_ */
