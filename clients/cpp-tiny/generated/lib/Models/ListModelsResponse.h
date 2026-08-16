
/*
 * ListModelsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ListModelsResponse_H_
#define TINY_CPP_CLIENT_ListModelsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Model.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ListModelsResponse{
public:

    /*! \brief Constructor.
	 */
    ListModelsResponse();
    ListModelsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ListModelsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::list<Model> getData();

	/*! \brief Set 
	 */
	void setData(std::list <Model> data);


    private:
    std::string object{};
    std::list<Model> data;
};
}

#endif /* TINY_CPP_CLIENT_ListModelsResponse_H_ */
