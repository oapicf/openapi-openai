
/*
 * Static_Chunking_Strategy.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Static_Chunking_Strategy_H_
#define TINY_CPP_CLIENT_Static_Chunking_Strategy_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Static_Chunking_Strategy_static.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Static_Chunking_Strategy{
public:

    /*! \brief Constructor.
	 */
    Static_Chunking_Strategy();
    Static_Chunking_Strategy(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Static_Chunking_Strategy();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Always `static`.
	 */
	std::string getType();

	/*! \brief Set Always `static`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	Static_Chunking_Strategy_static getRStatic();

	/*! \brief Set 
	 */
	void setRStatic(Static_Chunking_Strategy_static  r_static);


    private:
    std::string type{};
    Static_Chunking_Strategy_static r_static;
};
}

#endif /* TINY_CPP_CLIENT_Static_Chunking_Strategy_H_ */
