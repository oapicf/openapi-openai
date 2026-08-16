
/*
 * PredictionContent.h
 *
 * Static predicted output content, such as the content of a text file that is being regenerated. 
 */

#ifndef TINY_CPP_CLIENT_PredictionContent_H_
#define TINY_CPP_CLIENT_PredictionContent_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PredictionContent_content.h"

namespace Tiny {


/*! \brief Static predicted output content, such as the content of a text file that is being regenerated. 
 *
 *  \ingroup Models
 *
 */

class PredictionContent{
public:

    /*! \brief Constructor.
	 */
    PredictionContent();
    PredictionContent(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PredictionContent();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of the predicted content you want to provide. This type is currently always `content`. 
	 */
	std::string getType();

	/*! \brief Set The type of the predicted content you want to provide. This type is currently always `content`. 
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	PredictionContent_content getContent();

	/*! \brief Set 
	 */
	void setContent(PredictionContent_content  content);


    private:
    std::string type{};
    PredictionContent_content content;
};
}

#endif /* TINY_CPP_CLIENT_PredictionContent_H_ */
