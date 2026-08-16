
/*
 * Batch_errors.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Batch_errors_H_
#define TINY_CPP_CLIENT_Batch_errors_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Batch_errors_data_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Batch_errors{
public:

    /*! \brief Constructor.
	 */
    Batch_errors();
    Batch_errors(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Batch_errors();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The object type, which is always `list`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `list`.
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::list<Batch_errors_data_inner> getData();

	/*! \brief Set 
	 */
	void setData(std::list <Batch_errors_data_inner> data);


    private:
    std::string object{};
    std::list<Batch_errors_data_inner> data;
};
}

#endif /* TINY_CPP_CLIENT_Batch_errors_H_ */
