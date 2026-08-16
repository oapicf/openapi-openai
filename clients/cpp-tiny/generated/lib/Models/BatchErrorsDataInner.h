
/*
 * Batch_errors_data_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Batch_errors_data_inner_H_
#define TINY_CPP_CLIENT_Batch_errors_data_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Batch_errors_data_inner{
public:

    /*! \brief Constructor.
	 */
    Batch_errors_data_inner();
    Batch_errors_data_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Batch_errors_data_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get An error code identifying the error type.
	 */
	std::string getCode();

	/*! \brief Set An error code identifying the error type.
	 */
	void setCode(std::string  code);
	/*! \brief Get A human-readable message providing more details about the error.
	 */
	std::string getMessage();

	/*! \brief Set A human-readable message providing more details about the error.
	 */
	void setMessage(std::string  message);
	/*! \brief Get The name of the parameter that caused the error, if applicable.
	 */
	std::string getParam();

	/*! \brief Set The name of the parameter that caused the error, if applicable.
	 */
	void setParam(std::string  param);
	/*! \brief Get The line number of the input file where the error occurred, if applicable.
	 */
	int getLine();

	/*! \brief Set The line number of the input file where the error occurred, if applicable.
	 */
	void setLine(int  line);


    private:
    std::string code{};
    std::string message{};
    std::string param{};
    int line{};
};
}

#endif /* TINY_CPP_CLIENT_Batch_errors_data_inner_H_ */
