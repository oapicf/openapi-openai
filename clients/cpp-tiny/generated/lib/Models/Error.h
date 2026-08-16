
/*
 * Error.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Error_H_
#define TINY_CPP_CLIENT_Error_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Error{
public:

    /*! \brief Constructor.
	 */
    Error();
    Error(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Error();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getCode();

	/*! \brief Set 
	 */
	void setCode(std::string  code);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);
	/*! \brief Get 
	 */
	std::string getParam();

	/*! \brief Set 
	 */
	void setParam(std::string  param);
	/*! \brief Get 
	 */
	std::string getType();

	/*! \brief Set 
	 */
	void setType(std::string  type);


    private:
    std::string code{};
    std::string message{};
    std::string param{};
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_Error_H_ */
