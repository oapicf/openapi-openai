
/*
 * CreateTranslationResponseJson.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateTranslationResponseJson_H_
#define TINY_CPP_CLIENT_CreateTranslationResponseJson_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateTranslationResponseJson{
public:

    /*! \brief Constructor.
	 */
    CreateTranslationResponseJson();
    CreateTranslationResponseJson(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateTranslationResponseJson();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getText();

	/*! \brief Set 
	 */
	void setText(std::string  text);


    private:
    std::string text{};
};
}

#endif /* TINY_CPP_CLIENT_CreateTranslationResponseJson_H_ */
